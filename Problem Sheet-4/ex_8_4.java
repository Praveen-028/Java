import java.util.Scanner;
public class ex_8_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate if the input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Check if the number is perfect
        int sum = 0;
        System.out.print("Proper divisors of " + number + ": ");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == number) {
            System.out.println("\n" + number + " is a perfect number.");
        } else {
            System.out.println("\n" + number + " is not a perfect number.");
        }

        scanner.close();
    }
}
