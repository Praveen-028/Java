public class VowelChecker {
    public static void main(String[] args) {
        String input = "Hello"; // Change this to test different strings
        try {
            checkForVowels(input);
            System.out.println("The string contains vowels.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForVowels(String str) throws Exception {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new Exception("Error: String does not contain vowels.");
        }
    }
}
