import java.util.Scanner;

public class PhoneNumberCleaner {
    public static String cleanPhoneNumber(String phoneNumber) {
        // Remove all non-digit characters from the phone number
        String cleanedNumber = phoneNumber.replaceAll("[^\\d]", "");

        // Check if the phone number starts with a country code
        if (cleanedNumber.length() >= 11 && cleanedNumber.startsWith("1")) {
            // Remove the country code '1' from the beginning for NANP
            cleanedNumber = cleanedNumber.substring(1);
        }

        // Return the cleaned phone number
        return cleanedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a phone number: ");
            String phoneNumber = scanner.nextLine();

            String cleanedNumber = cleanPhoneNumber(phoneNumber);
            System.out.println("Cleaned phone number: " + cleanedNumber);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
