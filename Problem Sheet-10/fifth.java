import java.io.*;

public class fifth {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileStatistics <fileName>");
            return;
        }

        String fileName = args[0];

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File not found: " + fileName);
                return;
            }

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lineCount++;
                    charCount += line.length();
                    wordCount += countWords(line);
                }
            }

            System.out.println("Character count: " + charCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static int countWords(String line) {
        String[] words = line.trim().split("\\s+");
        return words.length;
    }
}
