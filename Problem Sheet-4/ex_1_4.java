import java.util.*;
public class ex_1_4 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the nunber of calls");
    float bill,temp, call=sc.nextInt();
    if(call<=100)
    {bill=200;}
    if(call>100 && call<=150)
    {
        temp=call-100;
        temp=temp*(float)0.6;
        bill= bill + temp;
    }
    }    
}
