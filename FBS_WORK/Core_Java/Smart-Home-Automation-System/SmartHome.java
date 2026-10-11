import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SmartHome {

    private final Map<String, Room> rooms;

    public SmartHome() {
        rooms = new LinkedHashMap<>();
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException(
                "Room cannot be null."
            );
        }

        String key = room.getName().toLowerCase();

        if (rooms.containsKey(key)) {
            throw new IllegalArgumentException(
                "Room already exists: " + room.getName()
            );
        }

        rooms.put(key, room);
    }

    public Room getRoom(String roomName) {
        if (roomName == null) {
            return null;
        }

        return rooms.get(roomName.trim().toLowerCase());
    }

    public Collection<Room> getRooms() {
        return Collections.unmodifiableCollection(
            rooms.values()
        );
    }

    public void addDevice(String roomName, Device device) {
        Room room = getRoom(roomName);

        if (room == null) {
            throw new IllegalArgumentException(
                "Room not found: " + roomName
            );
        }

        room.addDevice(device);
    }

    public void controlDevice(
            String roomName,
            String deviceName,
            boolean turnOn) {

        Room room = getRoom(roomName);

        if (room == null) {
            throw new IllegalArgumentException(
                "Room not found: " + roomName
            );
        }

        Device device = room.getDevice(deviceName);

        if (device == null) {
            throw new IllegalArgumentException(
                "Device not found: " + deviceName
            );
        }

        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }

        System.out.println(
            device.getName() + " is now "
            + (device.isOn() ? "ON" : "OFF")
        );
    }

    public void displayAllStatus() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms available.");
            return;
        }

        System.out.println("\n========== SMART HOME STATUS ==========");

        for (Room room : rooms.values()) {
            room.displayStatus();
        }

        System.out.println("\n========== END OF REPORT ==============");
    }
}
