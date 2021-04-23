class Main {
    public static void main(String[] args) {
        System.out.println(findFactorialRecursive(10));
        System.out.println(findFactorialIterative(10));
    }
    
    
    public static int findFactorialRecursive(int number) { //O(n)
      if(number == 1){
          return 1;
      }
      return number*findFactorialRecursive(number-1);
    }
    
    public static int findFactorialIterative(int number) { //O(n)
        int result=1;
        for(int i=0; i<number;i++){
             result*=(number-i);
        }
        return result;
    }
}