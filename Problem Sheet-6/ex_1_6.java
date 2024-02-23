import java.util.*;

public class ex_1_6 {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        
        System.out.print("Enter the Number of A seats");
        int noofAseats=sc.nextInt();

        System.out.print("Enter the price of the A seat");
        double priceofAseats=sc.nextDouble();

        System.out.print("Enter the Number of B seats");
        int noofBseats=sc.nextInt();

        System.out.print("Enter the price of the B seat");
        double priceofBseats=sc.nextDouble();

        System.out.print("Enter the Number of C seats");
        int noofCseats=sc.nextInt();

        System.out.print("Enter the price of the C seat");
        double priceofCseats=sc.nextDouble();

        double totalsales= (noofAseats*priceofAseats)+(noofBseats*priceofBseats)+(noofCseats*priceofCseats);

        System.out.println("The total sales of the seats is :"+ totalsales);
        sc.close();
    }
}
