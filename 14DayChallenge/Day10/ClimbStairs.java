//Aswin's Solution

import java.util.Scanner;
public class ClimbStairs{
    public int Solution(int steps){
        if(steps == 1) return 1;
        int[] newarray = new int[steps + 1];
        newarray[1] = 1;
        newarray[2] = 2;
        for(int i=3;i<=steps;i++){
            newarray[i] = newarray[i-1] + newarray[i-2];
        }
        return newarray[steps]; 
    }
    public static void main(String[] args){
        ClimbStairs obj = new ClimbStairs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the steps: ");
        int steps = sc.nextInt();
        int result = obj.Solution(steps);
        System.out.println("Total Distinct ways you can climb is : " + result);
    }
}