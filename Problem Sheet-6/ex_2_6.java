import java.util.*;

class circle {
    double radius;
    public circle (double radius)
    {
        this.radius=radius;
    }
    public double Area()
    {
        return 3.14*radius*radius;
    }
    public double circumference()
    {
        return 2*3.14*radius;
    }
}
public class ex_2_6{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter the radius of the inner circle :");
        double ri=sc.nextDouble();

        System.out.print("Enter the radius of the outer circle :");
        double ro=sc.nextDouble();

        circle innerCircle = new circle(ri);
        
        circle outerCircle = new circle(ro);

        double a1,a2,fa;
        a1= innerCircle.Area();

        a2 = outerCircle.Area();

        fa = a2-a1;

        System.out.print("The area is :"+fa);
        sc.close();
    }
}
