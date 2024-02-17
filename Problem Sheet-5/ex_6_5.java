public class ex_6_5 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java LetterCounter <string>");
            return;
        }

        String input = args[0];
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + upperCaseCount);
        System.out.println("Number of lowercase letters: " + lowerCaseCount);
    }
}
