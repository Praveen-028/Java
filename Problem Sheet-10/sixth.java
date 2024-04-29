import java.io.*;

public class sixth {
    public static void main(String[] args) {
        String fileName = "multiplication_table.txt";
        int n = 3; // Example value, you can change it to any positive integer

        try {
            writeMultiplicationTableToFile(fileName, n);
            System.out.println("Multiplication table of size " + n + " written to '" + fileName + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void writeMultiplicationTableToFile(String fileName, int n) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int product = i * j;
                    writer.write(String.format("%-4d", product)); // Write the product with padding for alignment
                }
                writer.newLine(); // Move to the next line after each row
            }
        }
    }
}
