import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        Set<Integer> numbersSet = new HashSet<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (!numbersSet.add(num)) {
                System.out.println("Error: Duplicate number found!");
                throw new IllegalArgumentException("Duplicate number found: " + num);
            }
        }

        System.out.println("All numbers are unique.");
    }
}
