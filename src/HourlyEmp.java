public class HourlyEmp extends Employee{

    private double hoursWorked;

    public HourlyEmp(String firstName, String lastName, String title, double hourlyRate, double hoursWorked){
        super(firstName, lastName, title, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return payRate * hoursWorked;
    }

    public void display(){
        System.out.println(toString());
        System.out.printf("Hours worked: %.1f%n", hoursWorked);
        System.out.printf("Salary: %.2f%n", calculateSalary());
    }
}
