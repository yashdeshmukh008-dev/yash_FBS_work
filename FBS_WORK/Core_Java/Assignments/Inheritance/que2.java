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

    public void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Company: " + companyName);
        System.out.println("Number of Wheels: " + noOfWheels);
        System.out.println("Price: " + price);
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

    public void displayBike() {
        displayVehicle();
        System.out.println("Number of Stands: " + noOfStands);
        System.out.println("Number of Helmets: " + noOfHelmets);
        System.out.println("Bike Category: " + bikeCategory);
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

    public void displayCar() {
        displayVehicle();
        System.out.println("Power Steering: " + hasPowerSteering);
        System.out.println("Drive Mode: " + driveMode);
        System.out.println("Parking Assist Sensors: " + parkingAssistSensors);
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

    public void displayBus() {
        displayVehicle();
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Standing Capacity: " + standingCapacity);
    }
}
