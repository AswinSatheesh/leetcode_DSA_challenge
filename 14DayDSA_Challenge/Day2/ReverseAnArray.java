//Aswin's solution
public class ReverseAnArray{
    public static void main(String[] args){
        int[] arr = {2,11,5,10,7,8};
        int len = arr.length;
        System.out.println("Actual Array : ");
        for(int j =0; j < len; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("After reversing  Array : ");
        for(int i=len-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        
    }
}