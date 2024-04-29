public class CommandLineDivision {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Error: Please provide two numbers.");
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            if (num2 == 0) {
                throw new ArithmeticException("Error: Division by zero is not allowed.");
            }

            int result = num1 / num2;
            System.out.println("Division result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input format. Please enter integers.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
