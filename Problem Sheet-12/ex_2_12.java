import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> scores_list = new ArrayList<>();
        scores_list.add(84);
        scores_list.add(70);
        scores_list.add(90);
        scores_list.add(67);
        scores_list.add(77);
        scores_list.add(94);
        scores_list.add(92);
        scores_list.add(71);
        scores_list.add(80);
        scores_list.add(95);

        // Using an iterator to remove odd-valued scores
        Iterator<Integer> iterator = scores_list.iterator();
        while (iterator.hasNext()) {
            int score = iterator.next();
            if (score % 2 != 0) {
                iterator.remove(); // Remove odd-valued score
            }
        }

        System.out.println("Scores list after removing odd-valued scores: " + scores_list);
    }
}
