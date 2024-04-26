class Employee{
    private String Emp_name;
    private int Emp_id;
    private String Address;
    private String Mail_id;
    private int Mobile_no;

    public Employee(String name,int id,String Addres,String Mail,int Mobile){
        this.Emp_name=name;
        this.Emp_id=id;
        this.Address=Addres;
        this.Mail_id=Mail;
        this.Mobile_no=Mobile;
    }
}
class Programmer extends Employee
{
    private int Basicpay;
    public Programmer(String Emp_name,int Emp_id,String Address, String Mail_id,int Mobile_no)
    {
        super(Emp_name,Emp_id,Address,Mail_id,Mobile_no)
        this.Basicpay=Basicpay;
    }

    public double calDA()
    {
        return 0.097 * Basicpay;
    }
    public double calHRA()
    {
        return 0.010 * Basicpay;
    }
    public double calPF()
    {
        return 0.012 * Basicpay;
    }
    public double staffclub()
    {
        return 0.01 * Basicpay;
    }
}
class Assistant_Professor extends Employee
{
    public Assistant_Professor()
    {
        
    }
}
class Associate_Professor extends Employee
{
    public Associate_Professor()
    {
        return 0.012 * Basicpay;
    }
}
public class ex_2_7 {
    public static void main(String[]args)
    {
        Programmer pro = new Programmer("Praveen", 101, "123 Main St", "john.doe@example.com", "1234567890", 50000)
    }
}
