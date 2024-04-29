import java.util.ArrayList;
import java.util.Iterator;

public class StringRemover {
    public static void main(String[] args) {
        // Example usage
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("apple");
        words.add("date");
        words.add("banana");

        String wordToRemove = "apple";
        removeOccurrences(words, wordToRemove);

        System.out.println("Words list after removing '" + wordToRemove + "': " + words);
    }

    public static void removeOccurrences(ArrayList<String> list, String wordToRemove) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals(wordToRemove)) {
                iterator.remove(); // Remove the word if it matches the wordToRemove
            }
        }
    }
}
