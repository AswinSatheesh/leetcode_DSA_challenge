//Aswin's solution
import java.util.*;
public class RomanToInteger{
    public int Convert(String s){
        int res = 0;
        for(int i =0; i < s.length(); i++){
            int val = getValue(s.charAt(i));
            if(i+1 < s.length() && getValue(s.charAt(i+1)) > val){
                res = res - val;
            }
            else{
                res = res +val;
            }
        }
        return res;

    }

    private int getValue(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args){
        RomanToInteger obj = new RomanToInteger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Letter : ");
        String s = sc.nextLine();
        System.out.println(obj.Convert(s));
    }
}