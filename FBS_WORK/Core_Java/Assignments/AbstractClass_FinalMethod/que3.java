import java.util.Scanner;

abstract class InsurancePolicy {
    protected String policyHolderName;
    protected double basePremium;

    public InsurancePolicy(String policyHolderName, double basePremium) {
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    public abstract double calculatePremium();

    public void printPolicyDetails() {

        double finalPremium = calculatePremium();

        System.out.println("\n----- Insurance Policy Details -----");
        System.out.println("Policy Holder : " + policyHolderName);
        System.out.println("Base Premium  : ₹" + basePremium);
        System.out.println("Final Premium : ₹" + finalPremium);
    }
}


class CarInsurance extends InsurancePolicy {
    private int carAgeInYears;
    private boolean hadAccidentInLastYear;
    private double carValue;

    public CarInsurance(String policyHolderName, double basePremium,
                        int carAgeInYears,
                        boolean hadAccidentInLastYear,
                        double carValue) {

        super(policyHolderName, basePremium);

        this.carAgeInYears = carAgeInYears;
        this.hadAccidentInLastYear = hadAccidentInLastYear;
        this.carValue = carValue;
    }

    @Override
    public double calculatePremium() {

        double premium = basePremium;

        // Car age loading
        if (carAgeInYears <= 3) {
            premium += premium * 0.10;
        } else if (carAgeInYears <= 7) {
            premium += premium * 0.20;
        } else {
            premium += premium * 0.30;
        }

        // Accident loading / no-accident discount
        if (hadAccidentInLastYear) {
            premium += premium * 0.25;
        } else {
            premium -= premium * 0.10;
        }

        // Car value condition
        if (carValue > 1000000) {
            premium += 2000;
        }

        return premium;
    }
}


class HealthInsurance extends InsurancePolicy {
    private int age;
    private boolean isSmoker;
    private boolean hasPreExistingDisease;

    public HealthInsurance(String policyHolderName, double basePremium,
                           int age,
                           boolean isSmoker,
                           boolean hasPreExistingDisease) {

        super(policyHolderName, basePremium);

        this.age = age;
        this.isSmoker = isSmoker;
        this.hasPreExistingDisease = hasPreExistingDisease;
    }

    @Override
    public double calculatePremium() {

        double premium = basePremium;

        // Age loading
        if (age < 30) {
            premium += premium * 0.10;
        } else if (age <= 45) {
            premium += premium * 0.25;
        } else {
            premium += premium * 0.40;
        }

        // Smoker / non-smoker
        if (isSmoker) {
            premium += premium * 0.30;
        } else {
            premium -= premium * 0.05;
        }

        // Pre-existing disease
        if (hasPreExistingDisease) {
            premium += premium * 0.20;
        }

        return premium;
    }
}


public class InsuranceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== INSURANCE PREMIUM CALCULATOR =====");

        System.out.println("1. Car Insurance");
        System.out.println("2. Health Insurance");

        System.out.print("Select policy type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter policy holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter base premium: ");
        double basePremium = sc.nextDouble();

        InsurancePolicy policy;

        if (choice == 1) {

            System.out.print("Enter car age in years: ");
            int carAge = sc.nextInt();

            System.out.print(
                    "Had accident in last year? (true/false): "
            );
            boolean accident = sc.nextBoolean();

            System.out.print("Enter car value: ");
            double carValue = sc.nextDouble();

            policy = new CarInsurance(
                    name,
                    basePremium,
                    carAge,
                    accident,
                    carValue
            );

        } else if (choice == 2) {

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Is smoker? (true/false): ");
            boolean smoker = sc.nextBoolean();

            System.out.print(
                    "Has pre-existing disease? (true/false): "
            );
            boolean disease = sc.nextBoolean();

            policy = new HealthInsurance(
                    name,
                    basePremium,
                    age,
                    smoker,
                    disease
            );

        } else {

            System.out.println("Invalid policy type.");
            sc.close();
            return;
        }

        policy.printPolicyDetails();

        sc.close();
    }
}
