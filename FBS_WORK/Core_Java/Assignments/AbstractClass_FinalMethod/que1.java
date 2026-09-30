import java.util.Scanner;

abstract class Payment {
    protected String paymentId;
    protected double amount;
    protected String payerName;
    protected String status;

    public Payment(String paymentId, double amount, String payerName) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.payerName = payerName;
        this.status = "PENDING";
    }

    public void printSummary() {
        System.out.println("\n----- Payment Summary -----");
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Payer Name : " + payerName);
        System.out.println("Amount     : ₹" + amount);
        System.out.println("Status     : " + status);
    }

    public final void process() {
        System.out.println("\nProcessing payment: " + paymentId);

        // Step 1: Validate
        if (!validate()) {
            status = "FAILED";
            System.out.println("Payment validation failed.");
            return;
        }

        System.out.println("Payment validation successful.");

        // Step 2: Deduct amount
        deductAmount();

        // Step 3: Send notification
        sendNotification();

        // Step 4: Set status
        status = "SUCCESS";

        System.out.println("Payment processed successfully.");
    }

    public abstract boolean validate();

    public abstract void deductAmount();

    public abstract void sendNotification();
}


class CardPayment extends Payment {
    private String cardNumber;
    private String cvv;

    public CardPayment(String paymentId, double amount, String payerName,
                       String cardNumber, String cvv) {
        super(paymentId, amount, payerName);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean validate() {
        return cardNumber.matches("\\d{16}")
                && cvv.matches("\\d{3}")
                && amount > 0;
    }

    @Override
    public void deductAmount() {
        System.out.println("₹" + amount +
                " deducted from card ending with "
                + cardNumber.substring(12));
    }

    @Override
    public void sendNotification() {
        System.out.println("Card payment notification sent to "
                + payerName + ".");
    }
}


class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String paymentId, double amount, String payerName,
                      String upiId) {
        super(paymentId, amount, payerName);
        this.upiId = upiId;
    }

    @Override
    public boolean validate() {
        return upiId.contains("@")
                && amount >= 1
                && amount <= 100000;
    }

    @Override
    public void deductAmount() {
        System.out.println("₹" + amount +
                " deducted through UPI ID: " + upiId);
    }

    @Override
    public void sendNotification() {
        System.out.println("UPI payment notification sent to "
                + payerName + ".");
    }
}


public class PaymentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of payments (2-4): ");
        int count = sc.nextInt();
        sc.nextLine();

        if (count < 2 || count > 4) {
            System.out.println("Please enter between 2 and 4 payments.");
            sc.close();
            return;
        }

        Payment[] payments = new Payment[count];

        for (int i = 0; i < count; i++) {

            System.out.println("\nPayment " + (i + 1));

            System.out.println("1. Card Payment");
            System.out.println("2. UPI Payment");
            System.out.print("Enter payment type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Payment ID: ");
            String paymentId = sc.nextLine();

            System.out.print("Enter Payer Name: ");
            String payerName = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Card Number: ");
                String cardNumber = sc.nextLine();

                System.out.print("Enter CVV: ");
                String cvv = sc.nextLine();

                payments[i] = new CardPayment(
                        paymentId,
                        amount,
                        payerName,
                        cardNumber,
                        cvv
                );

            } else if (choice == 2) {

                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();

                payments[i] = new UPIPayment(
                        paymentId,
                        amount,
                        payerName,
                        upiId
                );

            } else {
                System.out.println("Invalid payment type.");
                i--;
                continue;
            }
        }

        System.out.println("\n========== PAYMENT PROCESSING ==========");

        for (Payment payment : payments) {
            payment.process();
            payment.printSummary();
        }

        sc.close();
    }
}
