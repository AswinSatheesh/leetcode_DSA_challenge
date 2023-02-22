//Aswin's solution

public class SolutionMergeSortArray{
    public static void mergeArray(int[] arr1, int m, int[] arr2, int n){
        int i = m-1;
        int j = n-1;
        int k =  m + n -1;
        while(i >=0 && j >=0){
            if(arr1[i] > arr2[j]){
                arr1[k--] = arr1[i--];
            }else{
                arr1[k--] = arr2[j--];
            }
        }

        while(j >=0){
            arr1[k--] = arr2[j--];
        }
    }
    public static void main(String[] args){
        int[] arr1 = {2,5,9,0,0};
        int m=3;
        int[] arr2 = {3,7};
        int n=2;
        mergeArray(arr1,m,arr2,n);
        System.out.println("After Merging: ");
        System.out.print("[ ");
        for(int i=0; i<arr1.length;i++)
        {
            System.out.print(arr1[i]);
            if(i != arr1.length-1)   // this if is for making the array elements inside bracket and keep a space, bcz of this if last element will not have ',' and space.
            {
                System.out.print(", ");     

            }
        }
        System.out.print(" ]");
    }
}