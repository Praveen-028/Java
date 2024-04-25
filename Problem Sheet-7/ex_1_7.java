import java.util.ArrayList;

class account{
    private double bal;
    private int accnum;

    //constructor
    public account(int a){
        bal=0.0;
        accnum=a;
    }

    //deposit method
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
    //withdrawal method
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
    //returns balance
    public double getBalance()
    {
        return bal;
    }
    //
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
    
    // @Override
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
    public static void main(String[] args) {
        // Experiment with instances of the Account class
        account account1 = new account(1001);
        account1.deposit(500);
        account1.withdraw(200);
        System.out.println("Account 1 balance: " + account1.getBalance());

        // Experiment with instances of the SavingsAccount class
        SavingsAccount savingsAccount1 = new SavingsAccount(2001, 5.0); // Interest rate of 5%
        savingsAccount1.deposit(1000);
        savingsAccount1.addInterest(); // Add interest
        System.out.println("Savings Account 1 balance: " + savingsAccount1.getBalance());

        // Experiment with instances of the CurrentAccount class
        CurrentAccount currentAccount1 = new CurrentAccount(3001, 1000); // Overdraft limit of 1000
        currentAccount1.deposit(800);
        currentAccount1.withdraw(1200); // This will exceed the overdraft limit
        System.out.println("Current Account 1 balance: " + currentAccount1.getBalance());

        // Experiment with the Bank class
        Bank bank = new Bank();
        bank.openAccount(account1);
        bank.openAccount(savingsAccount1);
        bank.openAccount(currentAccount1);
        bank.payDividend(50); // Pay dividend to all accounts
        bank.update(); // Update accounts in the bank
    }  
}
