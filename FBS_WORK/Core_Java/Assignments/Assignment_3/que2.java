class Employee {
    
    static double bonusRate = 10.0;


    String employeeName;
    double basicSalary;

    Employee(String employeeName, double basicSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }


    static void updateBonusRate(double newBonusRate) {
        bonusRate = newBonusRate;
    }

    double calculateTotalSalary() {
        return basicSalary + (basicSalary * bonusRate / 100);
    }

    public static void main(String[] args) {
        Employee employee1 =
                new Employee("Amit", 50000);

        System.out.println("Employee: " + employee1.employeeName);
        System.out.println("Basic Salary: Rs. " + employee1.basicSalary);
        System.out.println("Total Salary: Rs. " +
                employee1.calculateTotalSalary());

        Employee.updateBonusRate(15.0);

        System.out.println("Updated Total Salary: Rs. " +
                employee1.calculateTotalSalary());
    }
}
