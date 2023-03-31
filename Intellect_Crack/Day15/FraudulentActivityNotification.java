import java.util.*;

public class FraudulentActivityNotification {

    public static void main(String[] args) {
        List<Integer> expenditure = new ArrayList<>(Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5));
        int d = 5;
        int notifications = activityNotifications(expenditure, d);
        System.out.println("Notifications: " + notifications); // expected output: 2
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int n = expenditure.size();
        int[] freq = new int[201]; // frequency table for expenditure values
        for (int i = 0; i < d; i++) {
            freq[expenditure.get(i)]++;
        }
        int notifications = 0;
        for (int i = d; i < n; i++) {
            int[] median = computeMedian(freq, d);
            if (expenditure.get(i) >= 2 * median[1]) {
                notifications++;
            }
            freq[expenditure.get(i - d)]--; // remove oldest element from frequency table
            freq[expenditure.get(i)]++; // add newest element to frequency table
        }
        return notifications;
    }

    private static int[] computeMedian(int[] freq, int d) {
        int[] median = new int[2];
        int count = 0;
        if (d % 2 == 0) {
            int first = -1, second = -1;
            for (int i = 0; i < freq.length; i++) {
                count += freq[i];
                if (first == -1 && count >= d / 2) {
                    first = i;
                }
                if (second == -1 && count >= d / 2 + 1) {
                    second = i;
                    break;
                }
            }
            median[0] = first;
            median[1] = second;
        } else {
            int value = -1;
            for (int i = 0; i < freq.length; i++) {
                count += freq[i];
                if (count > d / 2) {
                    value = i;
                    break;
                }
            }
            median[0] = value;
            median[1] = value;
        }
        return median;
    }
}
