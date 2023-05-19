//Aswin's solution

import java.util.*;
public class TwoString{
    public static String Solution(String s1,String s2){
        Set<Character> myset = new HashSet<>();

        for(char ch1 : s1.toCharArray()){
            myset.add(ch1);
        }

        for(char ch2 : s2.toCharArray()){
            if(myset.contains(ch2)){
                return "YES";
            }
        }

        return "NO";
    }
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "wyrd";
        String result = Solution(s1,s2);
        System.out.println(result);
    }
}