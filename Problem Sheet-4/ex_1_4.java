import java.util.*;
public class ex_1_4 
{
	public static void main(String[] args)
	{
    		Scanner sc =new Scanner(System.in);
    		System.out.println("Enter the nunber of calls");
    		float bill,temp, call=sc.nextInt();
    		if(call<=100)
    		{
			bill=200;
		}
    		else if(call>100 && call<=150)
    		{
        		temp=call-100;
        		temp=temp*(float)0.6;
        		bill= 200 + temp;
    		}
		else if(call>150 && call<=200)
		{
			temp=call-150;
			temp=temp*(float)0.5;
			bill=200+30+temp;
    		}
		else
		{
			temp=call-200;
			temp=temp*(float)0.4;
			bill=200+30+25+temp;
		}
	System.out.println("The telephone bill generated is "+bill);
	sc.close();
	}
}