import java.util.*;
import java.text.*;
class Football implements Sport {
    private static List<Integer> retired = new ArrayList<>();

    Football() {
        System.out.println("A new football team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        double sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        double avg = sum / age.length;

        System.out.println("The average age of the team is " + new DecimalFormat("####.##").format(avg));
    }

    @Override
    public void retirePlayer(int id) {
        if (!retired.contains(id)) {
            if (id >= 20) {
                System.out.println("Player with id: " + id + " has retired");
            } else if (id <= 40) {
                System.out.println("Player with id: " + id + " has retired");
            }
        } else {
            System.out.println("Player has already retired");
        }

        retired.add(id);
    }
    public void playerTransfer(int fee, int id) {
        System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
    }
}