//Aswin's Solution

public class ReverseArray{
    public static void printArray(int[] arr){  //by using satic method we don't need to create object to access the method , directly we can access
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,11,10,8,9,4};
        printArray(arr);

        System.out.println();
        reverse(arr,0,arr.length-1);
        printArray(arr);    
    }
}