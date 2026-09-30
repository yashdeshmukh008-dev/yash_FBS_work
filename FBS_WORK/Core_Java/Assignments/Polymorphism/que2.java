class Vehicle {
    protected String vehicleNumber;
    protected String model;
    protected String companyName;
    protected int noOfWheels;
    protected double price;

    public Vehicle(String vehicleNumber, String model, String companyName,
                   int noOfWheels, double price) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.companyName = companyName;
        this.noOfWheels = noOfWheels;
        this.price = price;
    }

    public void brake() {
        System.out.println("Vehicle applies brake.");
    }
}

class Bike extends Vehicle {
    private int noOfStands;
    private int noOfHelmets;
    private String bikeCategory;

    public Bike(String vehicleNumber, String model, String companyName,
                int noOfWheels, double price, int noOfStands,
                int noOfHelmets, String bikeCategory) {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.noOfStands = noOfStands;
        this.noOfHelmets = noOfHelmets;
        this.bikeCategory = bikeCategory;
    }

    @Override
    public void brake() {
        System.out.println("Bike uses hand-operated disc/drum brake.");
    }
}

class Car extends Vehicle {
    private boolean hasPowerSteering;
    private String driveMode;
    private int parkingAssistSensors;

    public Car(String vehicleNumber, String model, String companyName,
               int noOfWheels, double price, boolean hasPowerSteering,
               String driveMode, int parkingAssistSensors) {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.hasPowerSteering = hasPowerSteering;
        this.driveMode = driveMode;
        this.parkingAssistSensors = parkingAssistSensors;
    }

    @Override
    public void brake() {
        System.out.println("Car uses hydraulic braking system.");
    }
}

class Bus extends Vehicle {
    private int passengerCapacity;
    private int standingCapacity;

    public Bus(String vehicleNumber, String model, String companyName,
               int noOfWheels, double price, int passengerCapacity,
               int standingCapacity) {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.passengerCapacity = passengerCapacity;
        this.standingCapacity = standingCapacity;
    }

    @Override
    public void brake() {
        System.out.println("Bus uses heavy-duty air braking system.");
    }
}
