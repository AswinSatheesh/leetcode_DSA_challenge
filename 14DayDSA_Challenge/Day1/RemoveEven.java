public class RemoveEven{
    public int[] Solution(int[] arr){
        int oddCount =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] % 2 !=0){
                oddCount++;
            }
        }

        int[] newArray = new int[oddCount];
        int k=0;
        for(int j=0; j< arr.length; j++){
            if(arr[j] % 2 !=0){
                newArray[k] = arr[j];
                k++;
            }
        }

        return newArray;
    }
    public static void main(String args[]){
        RemoveEven obj = new RemoveEven();
        int[] arr = {3,2,4,7,10,6,5};
        int[] result = obj.Solution(arr);
        for(int m=0; m<result.length;m++)
        {
            System.out.print(result[m] + " ");
        }

    }
}