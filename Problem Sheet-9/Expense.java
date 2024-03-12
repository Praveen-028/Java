package MyBudget;
import java.util.*;
public class Expense{
	public int Expenses(){
		Scanner sc=new Scanner(System.in);
		
		int food;
		System.out.println("Enter the food Expense :");
		food=sc.nextInt();
		int cloth;
		
		System.out.println("Enter the cloth Expense");
		cloth=sc.nextInt();
		int edu;
		
		System.out.println("Enter the edu Expense");
		edu=sc.nextInt();
		
		return (food+cloth+edu);
	}
}
		