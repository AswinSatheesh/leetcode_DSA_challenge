public class RemoveEvenInterger{
    public int[] Solution(int[] arr){
        int len = arr.length;
        for(int i=0; i <len; i++){
            if(arr[i] % 2 == 0)
            {
                arr[i] = 0;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        RemoveEvenInterger obj = new RemoveEvenInterger();
        int[] arr = {3,2,4,7,10,6,5};
        int[] result = obj.Solution(arr);
        for(int j=0; j < result.length; j++)
        {
            if(result[j] !=0){
                System.out.print(result[j] + " ");
            }
        }
    }
}