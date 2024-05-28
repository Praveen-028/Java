// Custom exception class
class AgeBelowEighteenException extends Exception {
    public AgeBelowEighteenException(int age) {
        super("Age must be at least 18. Given age: " + age);
    }
}
    // Main method to run the age check
    public class Age{
    public static void main(String[] args) {
        int age = 16;  // Example age input
        try {
            if (age < 18) {
                throw new AgeBelowEighteenException(age);
            }
            System.out.println("Age is valid.");
        } catch (AgeBelowEighteenException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
