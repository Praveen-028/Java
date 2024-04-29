import java.io.*;

public class fourth {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java RemoveStringFromFile <inputFileName> <outputFileName> <stringToRemove>");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];
        String stringToRemove = args[2];

        try {
            removeStringFromFile(inputFileName, outputFileName, stringToRemove);
            System.out.println("Occurrences of '" + stringToRemove + "' removed. Edited file saved as '" + outputFileName + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void fourth(String inputFileName, String outputFileName, String stringToRemove) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(stringToRemove, ""); // Remove all occurrences of the specified string
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
