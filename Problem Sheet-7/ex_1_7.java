import java.util.ArrayList;

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
class SavingsAccount extends account {
    private double interestRate;

    public SavingsAccount(int accnum, double interestRate) {
        super(accnum);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
    
    @Override
    public String toString() {
        return super.toString() + "; Interest Rate =" + interestRate;
    }
}

class CurrentAccount extends account {
    private double overdraftLimit;

    public CurrentAccount(int accnum, double overdraftLimit) {
        super(accnum);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "; Overdraft Limit =" + overdraftLimit;
    }
}
class Bank {
    private ArrayList<account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void openAccount(account account) {
        accounts.add(account);
    }

    public void closeAccount(account account) {
        accounts.remove(account);
    }

    public void payDividend(double amount) {
        for (account account : accounts) {
            account.deposit(amount);
        }
    }

    public void update() {
        for (account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CurrentAccount) {
                CurrentAccount currentAccount = (CurrentAccount) account;
                if (currentAccount.getBalance() < 0) {
                    System.out.println("Sending letter to account " + currentAccount.getAccountNumber() + " for overdraft.");
                }
            }
        }
    }
}
public class ex_1_7 {
    
}
}