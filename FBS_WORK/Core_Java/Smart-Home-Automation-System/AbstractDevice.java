import java.util.concurrent.TimeUnit;

public abstract class AbstractDevice implements Device {

    private final String name;
    private boolean on;
    private long stateStartNanos;

    protected AbstractDevice(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Device name cannot be empty."
            );
        }

        this.name = name.trim();
        this.on = false;
        this.stateStartNanos = System.nanoTime();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public synchronized boolean isOn() {
        return on;
    }

    @Override
    public synchronized void turnOn() {
        changeState(true);
    }

    @Override
    public synchronized void turnOff() {
        changeState(false);
    }

    private void changeState(boolean newState) {
        if (on != newState) {
            on = newState;
            stateStartNanos = System.nanoTime();
        }
    }

    @Override
    public synchronized long getTimeInCurrentStateSeconds() {
        long elapsedNanos =
            System.nanoTime() - stateStartNanos;

        return TimeUnit.NANOSECONDS.toSeconds(elapsedNanos);
    }

    @Override
    public String toString() {
        return getType() + " - " + name;
    }
}
