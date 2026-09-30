class Employee {
    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Admin extends Employee {
    private double allowance;

    public Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    public void displayAdmin() {
        displayEmployee();
        System.out.println("Allowance: " + allowance);
    }
}

class SalesManager extends Employee {
    private double incentive;
    private double target;

    public SalesManager(int id, String name, double salary,
                        double incentive, double target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    public void displaySalesManager() {
        displayEmployee();
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }
}

class HR extends Employee {
    private double commission;

    public HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    public void displayHR() {
        displayEmployee();
        System.out.println("Commission: " + commission);
    }
}
