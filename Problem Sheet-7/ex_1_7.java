
class account{
    private double bal;
    private int accnum;
    public account(int a){
        bal=0.0;
        accnum=a;
    }
    public void deposit(double sum)
    {
        if(sum>0)
        {
            bal+=sum;
        }
        else
        {
            System.out.println("Deposit amount cannot ne negative");
        }
    }
    public void withdraw(double sum)
    {
        if(sum>0)
        {
            bal-=sum;
        }
        else{
            System.out.println("The withdraw amount can't be negaitve");
        }
    }
    public double getBalance()
    {
        return bal;
    }
    public double getAccountNumber()
    {
        return accnum;
    }
    public String toString()
    {
        return ("Acc"+accnum+"; Balance ="+bal);
    }
    public final void print()
    {
        System.out.println(toString());
    }
}
class Savingsaccount extends account
{
    private double interest;
    public Savingsaccount(){
        
    }

}

public class ex_1_7 {
    
}
