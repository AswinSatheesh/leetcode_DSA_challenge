//Aswin Solution
import java.util.Scanner;
public class TwoSum{
    public int[] twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("Not found answer");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int limit = sc.nextInt();
        int[] arr = new int[limit]; //accepting input from user //array syntax - datatype[] arrayname = new datatype[size]
        // int[] arr = {5,4,8,2};
        
        System.out.println("Enter the " + limit + " elements: ");
        for(int i=0;i<limit;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        TwoSum myobj = new TwoSum();
        int[] result = myobj.twoSum(arr,target);
        System.out.println("Indexes are : "+ result[0]+ " " + result[1]);
    }
}