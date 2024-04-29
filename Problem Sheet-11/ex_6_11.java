import java.util.Random;
import java.util.Scanner;

public class ArrayElementAccess {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] array = generateRandomArray(100);

        // Prompt the user to enter the index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array (0-99): ");
        int index = scanner.nextInt();

        // Display the corresponding element value or "Out of Bounds"
        if (index >= 0 && index < array.length) {
            System.out.println("Element at index " + index + " is: " + array[index]);
        } else {
            System.out.println("Out of Bounds");
        }

        scanner.close();
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Generate random integers between 0 and 999
        }
        return array;
    }
}
