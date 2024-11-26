public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", "Director", 5000.00);
        Employee employee2 = new Employee("John", "Doe", "Director", 5000.00);
        Employee employee3 = new Employee("Frank", "Johnson", "Assistant", 750.00);

        System.out.println(employee1.getFirstName() + "'s weekly salary is " + employee1.calculateWeeklySalary() );
        System.out.println(employee2.getFirstName() + "'s weekly salary is " + employee2.calculateWeeklySalary() );
        System.out.println(employee3.getFirstName() + "'s weekly salary is " + employee3.calculateWeeklySalary() );

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println(employee1.equals(employee2));
        System.out.println(employee2.equals(employee3));

        System.out.println("employee1" + employee1.hashCode());
        System.out.println("employee2" + employee2.hashCode());//should be the same as employee1
        System.out.println("employee3" + employee3.hashCode());

    }
}