public class AirConditioner extends AbstractDevice {

    public AirConditioner(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Air Conditioner";
    }
}
