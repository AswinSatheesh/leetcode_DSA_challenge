public class MissingNumber{
    public int Solution(int[] arr){
        int n = arr.length+1;
        int sum = n * (n+1)/2;
        for(int i=0; i<arr.length;i++){
            sum = sum-arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        MissingNumber obj = new MissingNumber();
        int[] arr = {1,2,4,5};
        int result = obj.Solution(arr);
        System.out.println("Missing number is : " + result);
    }
}

//: error: non-static method Solution(int[]) cannot be referenced from a static context  = To solve this error, you have to create a object to the main class and then call the function.