
import java.util.*;
public class MergeTwoSortedList
{
	public static void main(String[] args) {
		int list1[] = {1,2,4};
		int list2[] = {1,3,4};
		int len = (list1.length) + (list2.length);
// 		System.out.println("Lenth of new array : "+ len);
		int newarray[] = new int[len];
		int k=0;
		for(int i=0; i<list1.length;i++)
		{
		    newarray[k] = list1[i];
		    k++;
		}
		for(int i=0; i<list2.length;i++)
		{
		    newarray[k] = list2[i];
		    k++;
		}
		int arralength = newarray.length;
		System.out.println("latest array length : " + arralength);
// 		Arrays.sort(newarray);
// 		for(int j=0;j<newarray.length;j++)
// 		{
// 		    System.out.print(newarray[j]);
// 		}
    
    // sorting using bubble sort
    for(int i=0; i<arralength;i++)
    {
        for(int j=0;j<arralength-1-i;j++)
        {
            if(newarray[j] > newarray[j+1]){
                int temp = newarray[j];
                newarray[j] = newarray[j+1];
                newarray[j+1]=temp;
            }
            
        }
    }
    System.out.println("After sorting: ");
    for(int j=0;j<arralength;j++)
		{
		    System.out.print(newarray[j]);
		}
		
	}
    
}
