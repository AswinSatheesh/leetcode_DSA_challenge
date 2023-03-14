import java.util.*;

public class NewYearChaos {
    static void minimumBribes(List<Integer> q) {
        int n = q.size();
        int swaps = 0;

        for (int i = n - 1; i >= 0; i--) {
            int bribes = q.get(i) - (i + 1);

            if (bribes > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    swaps++;
                }
            }
        }

        System.out.println("Number of swaps is : " + swaps);
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of test cases :");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        System.out.println("Enter the number of people in the queue and elements :");
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // number of people in the queue
            List<Integer> q = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                q.add(x);
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
