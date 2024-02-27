import java.util.*;
public class ex_3_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bagweight");
        double bw =sc.nextDouble();
        System.out.print("Enter the no.of bags");
        double nb = sc.nextDouble();
        CoffeeBag calc=new CoffeeBag();

        double c1,c2;
        c1=calc.totalPrice(bw,nb);
        c2=calc.totalPricewithTax(c1);
        System.out.println("the prive with out tax :"+c1);
        System.out.println("the prive with tax :"+c2);
    sc.close();
    }
}
class CoffeeBag{
    double priceperpound=150.99;
    double taxrate=0.0725;
    double totalPricewithTax,totalPrice;
    
    public double totalPrice(double bagweight,double noofbags)
    {
        double totalPrice=this.priceperpound*bagweight*noofbags;
        return totalPrice;
    }

    public double totalPricewithTax(double totalPrice)
    {
        double totalPricewithTax = totalPrice+totalPrice*this.taxrate;
        return totalPricewithTax;
    }
}