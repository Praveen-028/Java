import java.util.*;
public class ex_2_4
{
	public static void main(String[] args)
	{
    		Scanner sc =new Scanner(System.in);
		System.out.println("How many number to be entered ");
		int num,cp=0,cn=0,cc=0,limit=sc.nextInt();

		for(int i=0;i<limit;i++)
		{
			System.out.println("enter the number");
			num=sc.nextInt();
			if(num>0)
			{
				cp++;
			}
			else if(num<0)
			{
				cn++;
			}
			else if(num==0)
			{
				cc++;
			}
		}
		System.out.println("The Positive count"+cp);
		System.out.println("The Negative count"+cn);
		System.out.println("The Zero count"+cc);
		sc.close();
	}
}