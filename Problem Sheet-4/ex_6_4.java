import java.util.Scanner;

public class ex_6_4 {

    public static void main(String[] args) {
        // Prompt the user to enter a 9-digit integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 9-digit integer: ");
        int input = scanner.nextInt();

        // Convert the input to a string to extract individual digits
        String inputStr = String.valueOf(input);

        // Calculate the checksum
        int checksum = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            checksum += (i + 1) * Character.getNumericValue(inputStr.charAt(i));
        }
        
        // Determine the checksum digit
        int checksumDigit = checksum % 11;
        
        // Convert the checksum digit to X if it's 10
        char checksumChar = (checksumDigit == 10) ? 'X' : (char) (checksumDigit + '0');

        // Print the 10-digit ISBN number
        System.out.println("The 10-digit ISBN number is: " + inputStr + checksumChar);

        // Close the scanner
        scanner.close();
    }
} 