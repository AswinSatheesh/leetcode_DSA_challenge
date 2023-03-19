import java.util.*;

public class Main {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n];

        // Perform updates
        for (List<Integer> query : queries) {
            int a = query.get(0) - 1;
            int b = query.get(1) - 1;
            int k = query.get(2);
            arr[a] += k;
            if (b + 1 < n) {
                arr[b + 1] -= k;
            }
        }

        // Compute prefix sum
        long max = 0;
        long prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            max = Math.max(max, prefixSum);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the n :");
        int n = scanner.nextInt();
        System.out.println("How many dimention matrix you need :");
        int m = scanner.nextInt();

        System.out.println("Enter the queries:");
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = scanner.nextInt();
            List<Integer> query = new ArrayList<>();
            query.add(a);
            query.add(b);
            query.add(k);
            queries.add(query);
        }

        
        long result = arrayManipulation(n, queries);
        System.out.println("Result is : " + result);

        scanner.close();
    }
}