//Aswin's Solution
import java.util.Scanner;
public class PlusOne{
    public int[] solution(int[] arr){
        int len = arr.length;
        for(int i= len-1; i>=0;i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            else{
                arr[i] = 0;
            }
        }
        int[] newNumber = new int[len+1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limit = 0;
        System.out.println("Enter your limit : ");
        limit = sc.nextInt();
        PlusOne obj = new PlusOne();
        int[] arr = new int[limit];
        System.out.println("Enter " + limit + " elements:" );
        for(int i=0; i<limit;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = obj.solution(arr);
        for(int i: result){
            System.out.print( i + " ");
        }
    }
}