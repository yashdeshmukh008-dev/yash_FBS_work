class ElectricityBill {
   
    static double ratePerUnit = 8.50;

    String customerName;
    double unitsConsumed;

    ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    
    static void updateRate(double newRate) {
        ratePerUnit = newRate;
    }


    double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    public static void main(String[] args) {
        ElectricityBill customer1 =
                new ElectricityBill("Rahul", 150);

        System.out.println("Customer: " + customer1.customerName);
        System.out.println("Units Consumed: " + customer1.unitsConsumed);
        System.out.println("Bill Amount: Rs. " + customer1.calculateBill());

     
        ElectricityBill.updateRate(10.00);

        System.out.println("Updated Bill: Rs. " + customer1.calculateBill());
    }
}
