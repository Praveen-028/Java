<<<<<<< HEAD
class Employee {
    String Emp_name, Emp_id, Address, Mail_id, Mobile_no;

    public Employee(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no) {
        this.Emp_name = Emp_name;
        this.Emp_id = Emp_id;
        this.Address = Address;
        this.Mail_id = Mail_id;
        this.Mobile_no = Mobile_no;
    }
}

class Programmer extends Employee {
    double BP;

    public Programmer(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BP = BP;
    }

    public double calculateDA() {
        return 0.097 * BP;
    }

    public double calculateHRA() {
        return 0.1 * BP;
    }

    public double calculatePF() {
        return 0.12 * BP;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BP;
    }

    public double calculateGrossSalary() {
        return BP + calculateDA() + calculateHRA() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for Programmer:");
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance (DA): " + calculateDA());
        System.out.println("House Rent Allowance (HRA): " + calculateHRA());
        System.out.println("Provident Fund (PF): " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}
class AssistantProfessor extends Employee {
    double BP;

    public AssistantProfessor(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BP = BP;
    }

    public double calculateDA() {
        return 0.097 * BP;
    }

    public double calculateHRA() {
        return 0.1 * BP;
    }

    public double calculatePF() {
        return 0.12 * BP;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BP;
    }

    public double calculateGrossSalary() {
        return BP + calculateDA() + calculateHRA() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for Assistant Professor:");
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance (DA): " + calculateDA());
        System.out.println("House Rent Allowance (HRA): " + calculateHRA());
        System.out.println("Provident Fund (PF): " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

class AssociateProfessor extends Employee {
    double BP;

    public AssociateProfessor(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BP = BP;
    }

    public double calculateDA() {
        return 0.097 * BP;
    }

    public double calculateHRA() {
        return 0.1 * BP;
    }

    public double calculatePF() {
        return 0.12 * BP;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BP;
    }

    public double calculateGrossSalary() {
        return BP + calculateDA() + calculateHRA() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for Associate Professor:");
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance (DA): " + calculateDA());
        System.out.println("House Rent Allowance (HRA): " + calculateHRA());
        System.out.println("Provident Fund (PF): " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

class Professor extends Employee {
    double BP;

    public Professor(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BP = BP;
    }

    public double calculateDA() {
        return 0.097 * BP;
    }

    public double calculateHRA() {
        return 0.1 * BP;
    }

    public double calculatePF() {
        return 0.12 * BP;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BP;
    }

    public double calculateGrossSalary() {
        return BP + calculateDA() + calculateHRA() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for Professor:");
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance (DA): " + calculateDA());
        System.out.println("House Rent Allowance (HRA): " + calculateHRA());
        System.out.println("Provident Fund (PF): " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class ex_2_7 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Doe", "P001", "Address", "john.doe@example.com", "1234567890", 50000);
        programmer.generatePaySlip();
    }
}
=======
class Employee {
    String Emp_name, Emp_id, Address, Mail_id, Mobile_no;

    public Employee(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no) {
        this.Emp_name = Emp_name;
        this.Emp_id = Emp_id;
        this.Address = Address;
        this.Mail_id = Mail_id;
        this.Mobile_no = Mobile_no;
    }
}

class Programmer extends Employee {
    double BP;

    public Programmer(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BP = BP;
    }

    public double calculateDA() {
        return 0.097 * BP;
    }

    public double calculateHRA() {
        return 0.1 * BP;
    }

    public double calculatePF() {
        return 0.12 * BP;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BP;
    }

    public double calculateGrossSalary() {
        return BP + calculateDA() + calculateHRA() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for Programmer:");
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance (DA): " + calculateDA());
        System.out.println("House Rent Allowance (HRA): " + calculateHRA());
        System.out.println("Provident Fund (PF): " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}
class AssistantProfessor extends Employee {
    double BP;

    public AssistantProfessor(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BP = BP;
    }

    public double calculateDA() {
        return 0.097 * BP;
    }

    public double calculateHRA() {
        return 0.1 * BP;
    }

    public double calculatePF() {
        return 0.12 * BP;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BP;
    }

    public double calculateGrossSalary() {
        return BP + calculateDA() + calculateHRA() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for Assistant Professor:");
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance (DA): " + calculateDA());
        System.out.println("House Rent Allowance (HRA): " + calculateHRA());
        System.out.println("Provident Fund (PF): " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

class AssociateProfessor extends Employee {
    double BP;

    public AssociateProfessor(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BP = BP;
    }

    public double calculateDA() {
        return 0.097 * BP;
    }

    public double calculateHRA() {
        return 0.1 * BP;
    }

    public double calculatePF() {
        return 0.12 * BP;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BP;
    }

    public double calculateGrossSalary() {
        return BP + calculateDA() + calculateHRA() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for Associate Professor:");
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance (DA): " + calculateDA());
        System.out.println("House Rent Allowance (HRA): " + calculateHRA());
        System.out.println("Provident Fund (PF): " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

class Professor extends Employee {
    double BP;

    public Professor(String Emp_name, String Emp_id, String Address, String Mail_id, String Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.BP = BP;
    }

    public double calculateDA() {
        return 0.097 * BP;
    }

    public double calculateHRA() {
        return 0.1 * BP;
    }

    public double calculatePF() {
        return 0.12 * BP;
    }

    public double calculateStaffClubFund() {
        return 0.001 * BP;
    }

    public double calculateGrossSalary() {
        return BP + calculateDA() + calculateHRA() + calculateStaffClubFund();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    public void generatePaySlip() {
        System.out.println("Pay Slip for Professor:");
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Basic Pay: " + BP);
        System.out.println("Dearness Allowance (DA): " + calculateDA());
        System.out.println("House Rent Allowance (HRA): " + calculateHRA());
        System.out.println("Provident Fund (PF): " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class ex_2_7 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Doe", "P001", "Address", "john.doe@example.com", "1234567890", 50000);
        programmer.generatePaySlip();
    }
}
>>>>>>> 8b1c6e5b4caa5676edac8d739aa70b95d8d6a25b
