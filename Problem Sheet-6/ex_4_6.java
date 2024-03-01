import java.util.*;
public class ex_4_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the part-number");
        String no=sc.nextLine();
        System.out.println("Enter the Description");
        String de=sc.nextLine();
        System.out.println("Enter the quantity");
        int quan=sc.nextInt();
        System.out.println("Enter the price");
        double pric=sc.nextDouble();

        invoice calc=new invoice(no,de,quan,pric);

        double res=calc.getInvoice();

        System.out.println("The total price is"+res);
        sc.close();
    }
}

class invoice {
    String partNo;
    String desc;
    int quantity;
    double price;
    public invoice (String no,String des,int qua,double pri)
    {
        this.partNo=no;
        this.desc=des;
        this.quantity=qua;
        this.price=pri;
    }

    public double getInvoice()
    {
        return this.quantity*this.price;
    }
}
