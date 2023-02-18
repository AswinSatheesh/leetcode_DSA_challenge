//Aswin's solution
public class MinElementInArray{
    public int minEle(int[] arr){
        if(arr == null || arr.length == 0)
        {
            throw new  IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        MinElementInArray obj = new MinElementInArray();
        int[] arr = {56,25,41,7,44};
        System.out.println(obj.minEle(arr));
    }
}