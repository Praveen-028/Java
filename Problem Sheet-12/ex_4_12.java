import java.util.ArrayList;

public class ArrayListReverser {
    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        reverseArrayList(numbers);

        System.out.println("Reversed ArrayList: " + numbers);
    }

    public static void reverseArrayList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> temp = new ArrayList<>();
        int size = arrayList.size();

        for (int i = size - 1; i >= 0; i--) {
            int element = arrayList.get(i);
            temp.add(element);
        }

        arrayList.clear(); // Clear the original ArrayList

        for (int i = 0; i < size; i++) {
            int element = temp.get(i);
            arrayList.add(element);
        }
    }
}
