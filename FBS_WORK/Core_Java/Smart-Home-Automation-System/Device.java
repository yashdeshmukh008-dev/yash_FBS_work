public interface Device {

    String getName();

    String getType();

    boolean isOn();

    void turnOn();

    void turnOff();

    long getTimeInCurrentStateSeconds();
}
