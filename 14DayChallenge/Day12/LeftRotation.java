import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class LeftRotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the no. of rotation :");
        int d = sc.nextInt();

        System.out.println("Enter the " + n + " elements :");

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        for(int i=0; i<d; i++){
            int temp = list.remove(0);
            list.add(temp);
        }

        for(int i=0; i<n; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}