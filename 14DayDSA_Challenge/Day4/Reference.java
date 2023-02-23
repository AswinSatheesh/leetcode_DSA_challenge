public class Reference{
    public static void result(int[] arr, int n){
        int j=0;
        for(int i=0; i < n; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {0,1,0,4,12};
        int len = arr.length;
        result(arr,len);
        System.out.println("After moves : ");
        for(int i=0; i< len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}