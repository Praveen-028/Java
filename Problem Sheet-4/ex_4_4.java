import java.util.*;
import java.lang.Math;
public class ex_4_4 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b,p;
        System.out.print("Enter the base :");
        b=sc.nextInt();
        System.out.print("Enter the Power :");
        p=sc.nextInt();
        System.out.print("The result is :"+ Math.pow(b, p));
        sc.close();
    }    
}
