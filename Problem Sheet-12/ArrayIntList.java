import java.util.Arrays;

public class ArrayIntList {
    private int[] elements;
    private int size;

    // Constructor and other methods of ArrayIntList

    public int learnIndexOf(int target) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == target) {
                return i; // Return the index of the first occurrence of the target value
            }
        }
        return -1; // Return -1 if the target value is not found in the list
    }

    public static void main(String[] args) {
        // Example usage
        ArrayIntList list = new ArrayIntList();
        list.add(42);
        list.add(7);
        list.add(-9);
        list.add(14);
        list.add(8);
        list.add(39);
        list.add(42);
        list.add(8);
        list.add(19);
        list.add(0);

        int index = list.learnIndexOf(8);
        System.out.println("Index of first occurrence of 8: " + index); // Output: 4
    }
}
