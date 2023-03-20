//Aswin's solution: 

import java.util.*;
public class SherlockAndAnagrams{
    public static int mySolution(String s){
        int count =0;
        Map<String,Integer> mymap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            for(int j= i+1; j<= s.length(); j++){
                String substr = s.substring(i,j);
                char[] charArry = substr.toCharArray();
                Arrays.sort(charArry);
                String backToString = new String(charArry);
                if(mymap.containsKey(backToString)){
                    count = count + mymap.get(backToString);
                    mymap.put(backToString,mymap.get(backToString)+1);
                }else{
                    mymap.put(backToString,1);
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        String s = "abba";   // op - 4
        // String s = "abcd"; //op - 0
        int result = mySolution(s);
        System.out.println("TOtal Anagrams possible is : "+ result);
    }
}