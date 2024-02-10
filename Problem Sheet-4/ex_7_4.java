public class ex_7_4 {
        public static void main(String[] args) {
            // Print table header
            System.out.println("\t5\t10\t15\t20\t25");
            
            // Iterate over width and length ranges
            for (int width = 11; width <= 20; width++) {
                // Print width for each row
                System.out.print(width + "\t");
                for (int length = 5; length <= 25; length += 5) {
                    // Calculate area and price
                    int area = width * length;
                    int price = area * 19; // Rs. 19 per square foot
    
                    // Print price for each combination
                    System.out.print(price + "\t");
                }
                // Move to the next line for the next width
                System.out.println();
            }
        }
    }