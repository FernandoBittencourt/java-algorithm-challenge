class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(10));
        System.out.println(fibonacciIterative(10));
    }
    
    
    public static int fibonacciRecursive(int number) { //O(2^n)
        if(number==1 || number==0){
            return number;
        }
        return fibonacciRecursive(number-1)+fibonacciRecursive(number-2);
    }
    
    public static int fibonacciIterative(int number) { //O(n)
        int result=0;
        int previous=1;
        int previous2=1;
        if(number==0 || number == 1){
            return number;
        } else if(number == 2){
            return 1;
        }
        for(int i=2; i<number;i++){
            result=previous+previous2;
            previous2=previous;
            previous=result;
        }
        return result;
    }
}