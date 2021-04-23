class Main {
    public static void main(String[] args) {
        System.out.println(reverseStringRecursive("abcdef"));
        System.out.println(reverseStringIterative("abcdef"));
    }
    
    public static String reverseStringIterative(String str) { //O(n)
        char[] result = new char[str.length()];
        char[] strAsCharArray = str.toCharArray();
        for(int i = 0; i<str.length(); i++){
            result[i]=strAsCharArray[str.length()-1 - i];
        }
        return new String(result);
    }
    public static String reverseStringRecursive(String str) { //O(n)
        char[] strAsCharArray = str.toCharArray();
        if(strAsCharArray.length<2){
            return new String(strAsCharArray);
        } 
        
        return strAsCharArray[strAsCharArray.length-1]+reverseStringRecursive(str.substring(1,str.length()-1))+ strAsCharArray[0];
    }
}