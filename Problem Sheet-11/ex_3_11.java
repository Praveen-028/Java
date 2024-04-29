public class NumberRangeChecker {
    public static void main(String[] args) {
        int number = 25; // Change this number to test different cases
        try {
            checkNumberRange(number);
            System.out.println("Square of the number: " + (number * number));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumberRange(int num) throws Exception {
        if (num < 10 || num > 50) {
            throw new Exception("Error: Number is out of range (10-50).");
        }
    }
}
