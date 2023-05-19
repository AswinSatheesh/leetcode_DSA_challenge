import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Example list of players
        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 25));
        players.add(new Player("Bob", 20));
        players.add(new Player("Charlie", 25));
        players.add(new Player("David", 30));

        // Sort the list of players using the checker comparator
        Collections.sort(players, new Checker());

        // Print the sorted list of players
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}
