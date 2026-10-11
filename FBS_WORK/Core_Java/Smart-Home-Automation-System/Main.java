import java.util.Scanner;

public class Main {

    private static final Scanner scanner =
        new Scanner(System.in);

    private static final SmartHome smartHome =
        new SmartHome();

    public static void main(String[] args) {
        createDefaultRooms();

        boolean running = true;

        System.out.println("======================================");
        System.out.println("     SMART HOME AUTOMATION SYSTEM");
        System.out.println("======================================");

        while (running) {
            displayMenu();

            int choice = readInt("Enter your choice: ");

            try {
                switch (choice) {
                    case 1:
                        addRoom();
                        break;

                    case 2:
                        addDevice();
                        break;

                    case 3:
                        controlDevice(true);
                        break;

                    case 4:
                        controlDevice(false);
                        break;

                    case 5:
                        smartHome.displayAllStatus();
                        break;

                    case 6:
                        listRoomsAndDevices();
                        break;

                    case 0:
                        running = false;
                        System.out.println(
                            "Thank you for using Smart Home Automation."
                        );
                        break;

                    default:
                        System.out.println(
                            "Invalid choice. Please try again."
                        );
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }

        scanner.close();
    }

    private static void createDefaultRooms() {
        smartHome.addRoom(new Room("Kitchen"));
        smartHome.addRoom(new Room("Living Area"));
        smartHome.addRoom(new Room("Dining Area"));
        smartHome.addRoom(new Room("Bedroom"));
        smartHome.addRoom(new Room("Washroom"));
        smartHome.addRoom(new Room("Corridors"));

        smartHome.addDevice(
            "Kitchen", new Light("Kitchen Light")
        );
        smartHome.addDevice(
            "Kitchen", new ElectronicDevice("Coffee Machine")
        );

        smartHome.addDevice(
            "Living Area", new Light("Living Light")
        );
        smartHome.addDevice(
            "Living Area", new Television("Smart TV")
        );
        smartHome.addDevice(
            "Living Area", new AirConditioner("Living AC")
        );

        smartHome.addDevice(
            "Dining Area", new Light("Dining Light")
        );

        smartHome.addDevice(
            "Bedroom", new Light("Bedroom Light")
        );
        smartHome.addDevice(
            "Bedroom", new AirConditioner("Bedroom AC")
        );

        smartHome.addDevice(
            "Washroom", new Light("Washroom Light")
        );
        smartHome.addDevice(
            "Washroom", new Shower("Main Shower")
        );

        smartHome.addDevice(
            "Corridors", new Light("Corridor Light")
        );
    }

    private static void displayMenu() {
        System.out.println("\n--------------- MENU ---------------");
        System.out.println("1. Add a room");
        System.out.println("2. Add a device to a room");
        System.out.println("3. Turn ON a device");
        System.out.println("4. Turn OFF a device");
        System.out.println("5. View all room and device statuses");
        System.out.println("6. List rooms and their devices");
        System.out.println("0. Exit");
        System.out.println("------------------------------------");
    }

    private static void addRoom() {
        String name = readText("Enter room name: ");

        smartHome.addRoom(new Room(name));

        System.out.println("Room added successfully.");
    }

    private static void addDevice() {
        String roomName = readText("Enter room name: ");

        Room room = smartHome.getRoom(roomName);

        if (room == null) {
            System.out.println("Room not found.");
            return;
        }

        System.out.println("\nSelect device type:");
        System.out.println("1. Light");
        System.out.println("2. Air Conditioner");
        System.out.println("3. Television");
        System.out.println("4. Shower");
        System.out.println("5. Electronic Device");

        int type = readInt("Enter device type: ");
        String deviceName = readText("Enter device name: ");

        Device device;

        switch (type) {
            case 1:
                device = new Light(deviceName);
                break;

            case 2:
                device = new AirConditioner(deviceName);
                break;

            case 3:
                device = new Television(deviceName);
                break;

            case 4:
                device = new Shower(deviceName);
                break;

            case 5:
                device = new ElectronicDevice(deviceName);
                break;

            default:
                System.out.println("Invalid device type.");
                return;
        }

        smartHome.addDevice(roomName, device);

        System.out.println(
            device.getType() + " added successfully to "
            + room.getName() + "."
        );
    }

    private static void controlDevice(boolean turnOn) {
        String roomName = readText("Enter room name: ");
        String deviceName = readText("Enter device name: ");

        smartHome.controlDevice(
            roomName, deviceName, turnOn
        );
    }

    private static void listRoomsAndDevices() {
        if (smartHome.getRooms().isEmpty()) {
            System.out.println("No rooms available.");
            return;
        }

        System.out.println("\n========== ROOMS AND DEVICES ==========");

        for (Room room : smartHome.getRooms()) {
            System.out.println("\nRoom: " + room.getName());

            if (room.getDevices().isEmpty()) {
                System.out.println("  No devices installed.");
                continue;
            }

            for (Device device : room.getDevices()) {
                System.out.println(
                    "  - " + device.getName()
                    + " (" + device.getType() + ")"
                );
            }
        }
    }

    private static String readText(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();

            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException ex) {
                System.out.println(
                    "Please enter a valid whole number."
                );
            }
        }
    }
}
