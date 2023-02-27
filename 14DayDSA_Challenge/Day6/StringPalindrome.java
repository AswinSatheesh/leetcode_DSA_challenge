//Aswin's solution

public class StringPalindrome{
    public boolean Solution(String str){
        char[] CharArray = str.toCharArray();
        int start =0;
        int end = str.length()-1; // its a string so we have to use 'length()' otherwise if its a int array or float we use 'length';
        while(start<end){
            if(CharArray[start] != CharArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        StringPalindrome obj = new StringPalindrome();
        String str= "that";
        System.out.println(obj.Solution(str));
    }
}