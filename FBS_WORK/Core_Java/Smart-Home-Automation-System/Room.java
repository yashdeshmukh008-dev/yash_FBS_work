import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Room {

    private final String name;
    private final Map<String, Device> devices;

    public Room(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Room name cannot be empty."
            );
        }

        this.name = name.trim();
        this.devices = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addDevice(Device device) {
        if (device == null) {
            throw new IllegalArgumentException(
                "Device cannot be null."
            );
        }

        String key = device.getName().toLowerCase();

        if (devices.containsKey(key)) {
            throw new IllegalArgumentException(
                "A device with this name already exists in "
                + name + "."
            );
        }

        devices.put(key, device);
    }

    public Device getDevice(String deviceName) {
        if (deviceName == null) {
            return null;
        }

        return devices.get(deviceName.trim().toLowerCase());
    }

    public Collection<Device> getDevices() {
        return Collections.unmodifiableCollection(
            devices.values()
        );
    }

    public boolean isAnyDeviceOn() {
        for (Device device : devices.values()) {
            if (device.isOn()) {
                return true;
            }
        }

        return false;
    }

    public void displayStatus() {
        System.out.println("\nRoom: " + name);
        System.out.println("----------------------------------------");

        if (devices.isEmpty()) {
            System.out.println("No devices added to this room.");
        } else {
            for (Device device : devices.values()) {
                String status = device.isOn() ? "ON" : "OFF";

                System.out.printf(
                    "%-20s | %-18s | %-3s | %s%n",
                    device.getName(),
                    device.getType(),
                    status,
                    formatDuration(
                        device.getTimeInCurrentStateSeconds()
                    )
                );
            }
        }

        System.out.println(
            "Room status: "
            + (isAnyDeviceOn() ? "ACTIVE" : "INACTIVE")
        );
    }

    private String formatDuration(long totalSeconds) {
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        return String.format(
            "%02d:%02d:%02d in current state",
            hours, minutes, seconds
        );
    }
}
