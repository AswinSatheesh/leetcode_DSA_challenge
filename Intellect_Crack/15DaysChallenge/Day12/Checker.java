import java.util.*;
class Checker implements Comparator<Player> {
    // Comparator function to sort players in decreasing order of score
    public int compare(Player a, Player b) {
        // If scores are equal, sort in increasing order of name
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        // Otherwise, sort in decreasing order of score
        return b.score - a.score;
    }
}