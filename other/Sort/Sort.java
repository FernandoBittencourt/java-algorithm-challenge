class Sort {
        
    public static void bubbleSort(int [] array){ //O(n^2)
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array.length-1;j++)
            if(array[j]>array[j+1]){
                int tempForSwap=array[j+1];
                array[j+1]=array[j];
                array[j]=tempForSwap;
            }
        }
    }
    
    
    
    public static void selectionSort(int [] array){ //O(n^2)
        for(int i=0; i<array.length;i++){
            int positionMin=i;
            for(int j=i+1; j<array.length;j++){
                if(array[positionMin]>array[j]){
                    positionMin=j;
                }
            }
            int tempForSwap=array[i];
            array[i]=array[positionMin];
            array[positionMin]=tempForSwap;
        }
    }
    
    public static void insertionSort(int [] array){ //O(n^2)
        for(int i=1; i<array.length; i++){
            int key=array[i];
            int j=i-1; 
            while(j>=0 && key<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
    
    
    public static void mergeSort(int [] array){ //O(n log n)
        if(array.length==1){
            return;
        }
        int middle = array.length/2;
        int[] left=new int[middle];
        int[] right = new int[array.length - middle];
        for(int i=0;i<array.length;i++){
            if(i<middle){
                left[i]=array[i];
            } else {
                right[i-middle]=array[i];
            }
        }
        mergeSort(left);
        mergeSort(right);
        int iL=0;
        int iR=0;
        for(int i=0; i<array.length;i++){
            if(iL>=left.length || (iR<right.length && right[iR]<left[iL])) {
                array[i]=right[iR];
                iR++;
            } else {
                array[i]=left[iL];
                iL++;
            }
        }
        
    }
}