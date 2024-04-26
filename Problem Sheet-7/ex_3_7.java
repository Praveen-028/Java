<<<<<<< HEAD
class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return hours * salaryRate;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int daysWorked) {
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; 
    }
}

public class ex_3_7 {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("John Doe", 50); // Assuming daily wage is $50
        SalariedWorker salariedWorker = new SalariedWorker("Jane Smith", 25); // Assuming hourly wage is $25

        int daysWorked = 5;
        int hoursWorked = 45; 

        double dailyWorkerPay = dailyWorker.computePay(daysWorked);
        double salariedWorkerPay = salariedWorker.computePay(hoursWorked);

        System.out.println("Daily Worker Pay: $" + dailyWorkerPay);
        System.out.println("Salaried Worker Pay: $" + salariedWorkerPay);
    }
}
=======
class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return hours * salaryRate;
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int daysWorked) {
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; 
    }
}

public class ex_3_7 {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("John Doe", 50); // Assuming daily wage is $50
        SalariedWorker salariedWorker = new SalariedWorker("Jane Smith", 25); // Assuming hourly wage is $25

        int daysWorked = 5;
        int hoursWorked = 45; 

        double dailyWorkerPay = dailyWorker.computePay(daysWorked);
        double salariedWorkerPay = salariedWorker.computePay(hoursWorked);

        System.out.println("Daily Worker Pay: $" + dailyWorkerPay);
        System.out.println("Salaried Worker Pay: $" + salariedWorkerPay);
    }
}
>>>>>>> 8b1c6e5b4caa5676edac8d739aa70b95d8d6a25b
