public class CommEmp extends Employee {

    private double sales;

    public CommEmp(String firstName, String lastName, String title, double payRate, double sales){
        super(firstName, lastName, title, payRate);
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        return payRate + (sales * .10);
    }
    public void display(){
        System.out.println(super.toString());
        double commission = sales * 0.10;
        System.out.printf("Commission: %.2f%n", commission);
        System.out.printf("Weekly pay: %.2f%n", calculateSalary());
    }

}
