import java.util.*;
public class ex_2_5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int inputNumber=sc.nextInt();
        boolean isItPrime=true;
        for (int j=0;j)

        for (int i = 2; i<= inputNumber/2; i++)
        {
        if ((inputNumber % i) == 0)
        {
        isItPrime = false;
        break;
        }
        }
        if (isItPrime)
        {
            System.out.println(inputNumber+"is a prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
        sc.close();
    }
}
