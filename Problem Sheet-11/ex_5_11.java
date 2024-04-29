import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        try {
            if (number < 0) {
                throw new Exception("Error: Cannot calculate square root of a negative number.");
            }

            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + squareRoot);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
