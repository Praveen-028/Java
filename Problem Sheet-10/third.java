import java.io.*;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the input text file name: ");
            String inputFileName = scanner.nextLine();
            System.out.print("Enter the output text file name: ");
            String outputFileName = scanner.nextLine();

            removeExtraSpaces(inputFileName, outputFileName);
            System.out.println("Extra spaces removed. Edited file saved as '" + outputFileName + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void third(String inputFileName, String outputFileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("\\s+", " "); // Replace multiple spaces with a single space
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
