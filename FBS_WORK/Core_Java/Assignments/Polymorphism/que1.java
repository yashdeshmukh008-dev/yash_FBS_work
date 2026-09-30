class Employee {
    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Employee salary: " + salary);
    }
}

class Admin extends Employee {
    private double allowance;

    public Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = salary + allowance;
        System.out.println("Admin salary: " + totalSalary);
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

    @Override
    public void calculateSalary() {
        double totalSalary = salary + incentive;
        System.out.println("Sales Manager salary: " + totalSalary);
    }
}

class HR extends Employee {
    private double commission;

    public HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = salary + commission;
        System.out.println("HR salary: " + totalSalary);
    }
}
