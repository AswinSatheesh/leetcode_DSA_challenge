//Aswin's solution

public class SalesByMatch{
    public static void main(String[] args){
    
        int[] arr = {10,20,20,10,10,30,50,10,20,20};
        int n = arr.length;
        int temp =0;
        for(int k=0;k<n;k++){
            for(int m=0;m<n-1-k;m++){
                if(arr[m] > arr[m+1]){
                    temp = arr[m];
                    arr[m] = arr[m+1];
                    arr[m+1] = temp;
                }
            }
        }
        System.out.println("After sorting array looks like: ");
        for(int z=0; z<n;z++){
            System.out.print(arr[z] + " ");
        }

        int i = 0,j=1,count =0;
            while(j<n && i <n){
                if(arr[i] == arr[j]){
                    count++;
                    i = i +2;
                    j = j +2;
                }
                else{
                    i++;
                    j++;
                }
                
            }
            System.out.println();
            System.out.println("Total count : " + count);

    }
}