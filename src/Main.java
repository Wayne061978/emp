import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Employee employee1 = new Employee("John", "Doe", "Director", 5000.00);
//        Employee employee2 = new Employee("John", "Doe", "Director", 5000.00);
//        Employee employee3 = new Employee("Frank", "Johnson", "Assistant", 750.00);
//
//        System.out.println(employee1.getFirstName() + "'s weekly salary is " + employee1.calculateWeeklySalary() );
//        System.out.println(employee2.getFirstName() + "'s weekly salary is " + employee2.calculateWeeklySalary() );
//        System.out.println(employee3.getFirstName() + "'s weekly salary is " + employee3.calculateWeeklySalary() );
//
//        System.out.println(employee1);
//        System.out.println(employee2);
//        System.out.println(employee3);
//
//        System.out.println(employee1.equals(employee2));
//        System.out.println(employee2.equals(employee3));
//
//        System.out.println("employee1" + employee1.hashCode());
//        System.out.println("employee2" + employee2.hashCode());//should be the same as employee1
//        System.out.println("employee3" + employee3.hashCode());

        Scanner scanner = new Scanner(System.in);
        Employee employee = null;

        System.out.print("Enter employee type (salary/hourly): ");
        String empType = scanner.nextLine().toLowerCase();

        if (empType.equals("salary")) {
            System.out.print("Enter employee first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter employee last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter employee title: ");
            String title = scanner.nextLine();
            System.out.print("Enter employee annual salary: ");
            double annualSalary = scanner.nextDouble();

            employee = new SalaryEmp(firstName, lastName, title, annualSalary);

        }else if (empType.equals("hourly")) {
            System.out.print("Enter employee first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter employee last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter employee title: ");
            String title = scanner.nextLine();
            System.out.print("Enter employee hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.print("Hours worked: ");
            double hoursWorked = scanner.nextDouble();

            employee = new HourlyEmp(firstName, lastName, title, hourlyRate, hoursWorked);

        }else {
            System.out.print("Invalid employee type.");
            return;
        }
        if (employee instanceof SalaryEmp) {
            ((SalaryEmp) employee).display();

        }else if (employee instanceof HourlyEmp) {
            ((HourlyEmp) employee).display();
        }

    }
}