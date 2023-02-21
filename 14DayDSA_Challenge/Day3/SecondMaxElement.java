//Aswin's solution

import java.util.*;
public class SecondMaxElement{
    public int Solution(int[] arr){
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                SecondMax = max;
                max = arr[i];
            }else if(arr[i] > SecondMax && arr[i] != max){
                SecondMax = arr[i];
            }
        }
        return SecondMax;
    }

    public static void main(String[] args){
        SecondMaxElement obj = new SecondMaxElement();
        int[] arr = {62,12,52,26,7};
        int result = obj.Solution(arr);
        System.out.println("Second Largest element is : " + result);
    }
}