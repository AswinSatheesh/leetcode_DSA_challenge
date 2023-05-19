import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of ArrayList:");
        int n = scanner.nextInt();
        System.out.println("Enter the trailing number:");
        int d = scanner.nextInt();
        System.out.println("Enter the "+ n + " elements of ArrayList:");
        List<Integer> expenditure = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            expenditure.add(scanner.nextInt());
        }
        scanner.close();
        int result = activityNotifications(expenditure, d);
        System.out.println("Number of notification : " + result);
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notificationCount = 0;
        // Track the frequency of numbers indexed from 0 to 200
        int[] freqArr = new int[201];
        for (int i = 0; i < d; i++) {
            freqArr[expenditure.get(i)]++;
        }

        int[] medianArr = new int[d];
        for (int startIdx = d; startIdx < expenditure.size(); startIdx++) {
            // Track the numbers needed to find median
            // Update medianArr with the data to find median from
            int pointer = 0;
            for (int i = 0; i < 201; i++) {
                int j = freqArr[i];
                while (j > 0) {
                    medianArr[pointer] = i;
                    pointer++;
                    j--;
                }
            }
            int currentDayExpenditure = expenditure.get(startIdx);
            double medianExpenditure = getMedianExpenditure(medianArr);
            if (currentDayExpenditure >= 2 * medianExpenditure) {
                ++notificationCount;
            }
            // Remove previous data
            freqArr[expenditure.get(startIdx - d)]--;
            // Add new data
            freqArr[expenditure.get(startIdx)]++;
        }
        return notificationCount;
    }

    private static double getMedianExpenditure(int[] arr) {
        int size = arr.length;
        if (size % 2 == 0) {
            return (arr[size / 2] + arr[(size / 2) - 1]) / 2.0;
        }
        return arr[size / 2];
    }
}
