import java.util.*;

public class ex_4_5 {
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < hours.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < hours[i].length; j++) {
                totalHours += hours[i][j];
            }
            employees.add(new Employee(i, totalHours));
        }

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.totalHours - e1.totalHours;
            }
        });

        System.out.println("Employee ID\tTotal Hours");
        for (Employee employee : employees) {
            System.out.println(employee.id + "\t\t" + employee.totalHours);
        }
    }

    static class Employee {
        int id;
        int totalHours;

        public Employee(int id, int totalHours) {
            this.id = id;
            this.totalHours = totalHours;
        }
    }
}
