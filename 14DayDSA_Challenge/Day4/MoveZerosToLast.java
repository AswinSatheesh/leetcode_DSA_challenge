//Aswin's solution
import java.util.Scanner;
public class MoveZerosToLast{
    public static void Solution(int[] arr, int len){
        int j=0;
        for(int i=0; i<len;i++){
            if(arr[i] !=0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the " + len + " elements: ");
        for(int ele =0; ele <len; ele++){
            arr[ele] = sc.nextInt();
        }
        System.out.println("Actual Array looks like: ");
        System.out.print("[ ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
            if(i != len-1){
                System.out.print(", ");
            }
        } 
        System.out.print(" ]");
        
        Solution(arr,len);
        System.out.println();
        System.out.println("After Moving Zeros to the last position");
        // for(int i=0; i<len; i++){
        //     System.out.print(arr[i] + " ");  // This is the normal way to print
        // }

        //To print like [elements inside box with comma]

        System.out.print("[ ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
            if(i != len-1){
                System.out.print(", ");
            }
        } 
        System.out.print(" ]");
    }
}