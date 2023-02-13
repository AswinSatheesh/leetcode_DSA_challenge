//Aswin's solution

public class RemoveDuplicates{
    public int Solution(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i +1;
    }

    public static void main(String[] args){
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] arr = {1,2,2,3,44,44,44};
        int len = obj.Solution(arr);
        System.out.println("New array length is : " + len);
        System.out.print("New array is : [");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}