import java.util.Objects;
import java.util.Scanner;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String title;
    protected double payRate;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double calculateWeeklySalary(){
        return payRate * 40;
    }

    public void inputEmployee(){
        Scanner scanner = new Scanner(System.in);
        Employee employee = null;

        System.out.print("Enter employee type (salary/hourly/commission): ");
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

        }else if (empType.equals("commission")) {
            System.out.print("Enter employee first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter employee last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter employee title: ");
            String title = scanner.nextLine();
            System.out.print("Enter employee payRate: ");
            double payRate = scanner.nextDouble();
            System.out.print("Enter employee sales: ");
            double sales = scanner.nextDouble();

            employee = new CommEmp(firstName, lastName, title, payRate, sales);

        }else {
            System.out.print("Invalid employee type.");
            return;
        }
        if (employee instanceof SalaryEmp) {
            ((SalaryEmp) employee).display();

        }else if (employee instanceof HourlyEmp) {
            ((HourlyEmp) employee).display();
        }else if (employee instanceof CommEmp) {
            ((CommEmp) employee).display();
        }


        scanner.close();
    }



    public String toString() {
        return firstName + " " + lastName + ", " + title + ", " + "$" + payRate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(payRate, employee.payRate) == 0
                && Objects.equals(firstName, employee.firstName)
                && Objects.equals(lastName, employee.lastName)
                && Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}
