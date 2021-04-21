import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2,5,1,2,3,5,1,2,4};
        Integer result=2;
        if(getFirstRepeated(array)==result){
            System.out.println("Case 1: OK");
        } else {
            System.out.println("Case 1: ERROR");
        }
        
        
        array = new int[]{2,1,1,2,3,5,1,2,4};
        result=1;
        if(getFirstRepeated(array)==result){
            System.out.println("Case 2: OK");
        } else {
            System.out.println("Case 2: ERROR");
        }
        
        array = new int[]{2,3,4,5};
        result=null;
        if(getFirstRepeated(array)==result){
            System.out.println("Case 2: OK");
        } else {
            System.out.println("Case 2: ERROR");
        }
    }
    
    public static Integer getFirstRepeated(int[] array){
        Set<Integer> visitedNumbers = new HashSet<>();
        for(int i=0; i<array.length; i++) {
            if(visitedNumbers.contains(array[i])){
                return array[i];
            }
            visitedNumbers.add(array[i]);
        }
        return null;
    }
}