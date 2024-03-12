package Budget;
import MyBudget.*;
public class FamilyBudget
{
	public static void main(String[]args)
	{
		Expense e = new Expense();
		Income i=new Income();
		int E =e.Expenses();
		int I =i.Incomes();
		System.out.println("The total Savings is "+(I-E));
	}
}