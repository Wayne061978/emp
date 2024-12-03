public class CommEmp extends Employee {

    private double sales;
    private double commissionRate = .10;

    public CommEmp(String firstName, String lastName, String title, double payRate, double sales){
        super(firstName, lastName, title, payRate);
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        if (sales > 1000) {
            return payRate + (sales * commissionRate);
        } else {
            return payRate;
        }
    }
    public void display(){
        System.out.println(super.toString());
        double commission = (sales >= 1000) ? (sales * commissionRate) : 0;
        if (commission > 0) {
            System.out.printf("Commission: %.2f%n", commission);
        }
        System.out.printf("Weekly pay: %.2f%n", (calculateSalary() + commission));
    }

}
