import java.util.ArrayList;
import java.util.Collections;

public class FruitSorter {
    public static void main(String[] args) {
        // Example usage
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");

        sortFruits(fruits);

        System.out.println("Sorted fruits: " + fruits);
    }

    public static void sortFruits(ArrayList<String> fruits) {
        Collections.sort(fruits); // Sort the ArrayList using Collections.sort()
    }
}
