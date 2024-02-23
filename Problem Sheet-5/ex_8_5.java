import java.util.Scanner;

public class ex_8_5
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[5];

        System.out.println("Enter 5 words:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();

            int vowelCount = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char c = Character.toLowerCase(words[i].charAt(j));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }

            System.out.println("Word: " + words[i] + ", Vowel count: " + vowelCount);
        }

        scanner.close();
    }
}
