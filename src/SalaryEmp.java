public class SalaryEmp extends Employee {

    public SalaryEmp(String firstName, String lastName, String title, double annualSalary) {
        super(firstName, lastName, title, annualSalary);

    }

    @Override
    public double calculateSalary(){
        return payRate /24;
    }

    public void display(){
        System.out.println(toString());
        System.out.printf("Bi-Monthly Salary: $%.2f%n", calculateSalary());
    }



}
