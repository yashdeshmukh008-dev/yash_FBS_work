import java.util.Scanner;

abstract class ElectricityBill {
    protected String customerName;
    protected double units;

    public ElectricityBill(String customerName, double units) {
        this.customerName = customerName;
        this.units = units;
    }

    public void showUsage() {
        System.out.println("\n----- Electricity Usage -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Units Consumed: " + units);
    }

    public abstract double calculateBill();

    public final void generateBill() {

        double bill = calculateBill();

        double tax = bill * 0.05;
        double fixedCharge = 50;

        double finalBill = bill + tax + fixedCharge;

        System.out.println("\n----- Final Electricity Bill -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Units         : " + units);
        System.out.println("Unit Charges  : ₹" + bill);
        System.out.println("Tax (5%)      : ₹" + tax);
        System.out.println("Fixed Charge  : ₹" + fixedCharge);
        System.out.println("----------------------------------");
        System.out.println("Final Bill    : ₹" + finalBill);
    }
}


class ResidentialBill extends ElectricityBill {

    public ResidentialBill(String customerName, double units) {
        super(customerName, units);
    }

    @Override
    public double calculateBill() {

        double bill;

        if (units <= 100) {
            bill = units * 2.5;
        } else if (units <= 300) {
            bill = (100 * 2.5)
                    + ((units - 100) * 3.5);
        } else {
            bill = (100 * 2.5)
                    + (200 * 3.5)
                    + ((units - 300) * 5);
        }

        if (units > 500) {
            bill += 150;
        }

        return bill;
    }
}


class CommercialBill extends ElectricityBill {

    public CommercialBill(String customerName, double units) {
        super(customerName, units);
    }

    @Override
    public double calculateBill() {

        double bill = units * 6.5;

        if (units < 200) {
            bill = 1500;
        }

        if (units > 1000) {
            double energySurcharge = bill * 0.08;
            bill += energySurcharge;
        }

        return bill;
    }
}


public class ElectricityBillDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ELECTRICITY BILL CALCULATOR =====");

        System.out.println("1. Residential");
        System.out.println("2. Commercial");

        System.out.print("Select customer type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        ElectricityBill bill;

        if (choice == 1) {

            bill = new ResidentialBill(customerName, units);

        } else if (choice == 2) {

            bill = new CommercialBill(customerName, units);

        } else {

            System.out.println("Invalid customer type.");
            sc.close();
            return;
        }

        bill.showUsage();
        bill.generateBill();

        sc.close();
    }
}
