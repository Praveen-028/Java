import java.util.*;
public class ex_5_4 {
    public static void main(String[] args) {
        int Lottery=(int)(Math.random()*100);
        System.out.println(Lottery);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Lottery number");
        int num=sc.nextInt();
        if (num<0 || num>99) {
            System.out.print("Invalid input enter again");
            sc.close();
            return;
        }
        String lo=String.format("%02d", Lottery);
        String nu=String.format("%02d", num);
        if (((nu.charAt(0)==lo.charAt(0))&&(nu.charAt(1)==lo.charAt(1))))
        {
            System.out.println("You have won Rs.10,000");
        }
        else if(((nu.charAt(0)==lo.charAt(1))&&(nu.charAt(1)==lo.charAt(0))))
        {
            System.out.println("You have won Rs.5,000");
        }
        else if((nu.charAt(0)==lo.charAt(0)||(nu.charAt(1)==lo.charAt(1)||nu.charAt(0)==lo.charAt(1)||nu.charAt(1)==lo.charAt(0))))
        {
            System.out.println("You have won Rs.3,000");
        }
        else
        {
            System.out.println("Sorry you don't win any lottery");
        }
        sc.close();
    }
    
}
