public class ElectronicDevice extends AbstractDevice {

    public ElectronicDevice(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Electronic Device";
    }
}
