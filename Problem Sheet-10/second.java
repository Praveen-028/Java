import java.io.*;
import java.util.*;

public class RandomIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of random integers to generate: ");
            int n = scanner.nextInt();
            generateRandomIntegers(n);
            processIntegersFile();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void generateRandomIntegers(int n) throws IOException {
        Random random = new Random();
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("integers.dat"))) {
            for (int i = 0; i < n; i++) {
                int randomNumber = random.nextInt(1000); // Generate random integers between 0 and 999
                dataOutputStream.writeInt(randomNumber);
            }
            System.out.println("Random integers generated and stored in 'integers.dat'.");
        }
    }

    public static void processIntegersFile() throws IOException {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("integers.dat"))) {
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;
            int sum = 0;
            int count = 0;

            while (dataInputStream.available() > 0) {
                int number = dataInputStream.readInt();
                smallest = Math.min(smallest, number);
                largest = Math.max(largest, number);
                sum += number;
                count++;
            }

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Smallest integer: " + smallest);
                System.out.println("Largest integer: " + largest);
                System.out.println("Average of integers: " + average);
            } else {
                System.out.println("No data found in 'integers.dat'.");
            }
        }
    }
}
