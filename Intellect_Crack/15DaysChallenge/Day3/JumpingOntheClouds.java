//Aswin's Solution

import java.util.*;
public class JumpingOntheClouds{
    public int Solution(List<Integer> ls){
        int listLen = ls.size();
        int count =0, i=0;
        while(i < listLen-1){
            if(i+2 < listLen && ls.get(i + 2) == 0){
                i = i + 2;
                count++;
            }else{
                i++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        JumpingOntheClouds obj = new JumpingOntheClouds();

        List<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int len = sc.nextInt();
        System.out.println("Enter the " + len + "Elements :");
        for(int i=0; i<len; i++){
            ls.add(sc.nextInt());
        }

        int result = obj.Solution(ls);
        System.out.println("Minimum Path : " + result);

    }
}