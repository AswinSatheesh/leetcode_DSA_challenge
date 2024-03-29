//Reverse a String using Stack
import java.util.Stack;
public class ReverseString{
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for(char c : chars){
            stack.push(c);
        }

        for(int i=0; i < str.length(); i++){ //string length = 'length()'
            chars[i] = stack.pop();
        }

        return new String(chars);
    }

    public static void main(String[] args){
        String str = "ABCD";
        System.out.println("Before Reverse : " + str);
        System.out.println("After Reverse : " + reverse(str));
    }
}