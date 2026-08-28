class Student {
    int rollNo;
    String name;
    double percentage;

    Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }
}

class Employee {
    int id;
    String name;
    double annualSalary;

    Employee(int id, String name, double annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }
}

class Bank {

    void approveLoan(Student s) {
        double loanAmount;

        if (s.percentage > 80) {
            loanAmount = 200000;
        } 
        else if (s.percentage >= 60) {
            loanAmount = 100000;
        } 
        else if (s.percentage >= 40) {
            loanAmount = 50000;
        } 
        else {
            loanAmount = 0;
        }

        System.out.println("Student Name: " + s.name);
        System.out.println("Percentage: " + s.percentage + "%");

        if (loanAmount > 0)
            System.out.println("Loan Approved: ₹" + loanAmount);
        else
            System.out.println("No Loan Approved");

        System.out.println();
    }

    void approveLoan(Employee e) {
        double loanAmount;

        if (e.annualSalary > 1200000) {
            loanAmount = 700000;
        } 
        else if (e.annualSalary >= 1000000) {
            loanAmount = 600000;
        } 
        else if (e.annualSalary >= 600000) {
            loanAmount = 500000;
        } 
        else if (e.annualSalary >= 400000) {
            loanAmount = 400000;
        } 
        else {
            loanAmount = 0;
        }

        System.out.println("Employee Name: " + e.name);
        System.out.println("Annual Salary: ₹" + e.annualSalary);

        if (loanAmount > 0)
            System.out.println("Loan Approved: ₹" + loanAmount);
        else
            System.out.println("No Loan Approved");

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85);
        Student s2 = new Student(102, "Amit", 55);

        Employee e1 = new Employee(201, "Priya", 1300000);
        Employee e2 = new Employee(202, "Neha", 800000);

        Bank bank = new Bank();

       
        bank.approveLoan(s1);
        bank.approveLoan(s2);

        
        bank.approveLoan(e1);
        bank.approveLoan(e2);
    }
}
