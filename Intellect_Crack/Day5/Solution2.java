import java.util.ArrayList;
import java.util.Scanner;

public class Solution2{

    static void minimumBribes(ArrayList<Integer> q) {
        int n = q.size();
        int swaps = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (q.get(i) != i + 1) {
                if (i - 1 >= 0 && q.get(i - 1) == i + 1) {
                    swaps++;
                    swap(q, i, i - 1);
                } else if (i - 2 >= 0 && q.get(i - 2) == i + 1) {
                    swaps += 2;
                    swap(q, i - 2, i - 1);
                    swap(q, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println("Total no of swap : " + swaps);
    }

    static void swap(ArrayList<Integer> q, int i, int j) {
        int temp = q.get(i);
        q.set(i, q.get(j));
        q.set(j, temp);
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of test cases :");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println("Enter the number of people in the queue and elements :");

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            ArrayList<Integer> q = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                q.add(scanner.nextInt());
            }
            minimumBribes(q);
        }
        scanner.close();
    }
}