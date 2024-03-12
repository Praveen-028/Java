package MyBudget;
import java.util.*;
public class Income{
	public int Incomes(){
		Scanner sc=new Scanner(System.in);
		
		int salary;
		System.out.println("Enter the Salary Income :");
		salary=sc.nextInt();
		int allo;
		
		System.out.println("Enter the Allowance Income :");
		allo=sc.nextInt();
		int rent;
		
		System.out.println("Enter the Rent Income");
		rent=sc.nextInt();
		
		return (salary+allo+rent);
	}
}
		