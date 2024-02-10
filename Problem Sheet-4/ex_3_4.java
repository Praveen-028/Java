import java.util.*;
public class ex_3_4 
{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int rows=sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing sequence
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing sequence
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }	        

}
