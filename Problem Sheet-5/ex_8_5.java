import java.util.Scanner;

public class ex_8_5
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the words
        String[] words = new String[5];

        // Prompt the user to enter 5 words
        System.out.println("Enter 5 words:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();

            // Count the number of vowels in the word
            int vowelCount = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char c = Character.toLowerCase(words[i].charAt(j));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }

            // Display the word and the vowel count
            System.out.println("Word: " + words[i] + ", Vowel count: " + vowelCount);
        }

        scanner.close();
    }
}
