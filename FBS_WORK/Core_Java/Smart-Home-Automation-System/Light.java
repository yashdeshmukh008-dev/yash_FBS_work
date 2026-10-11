public class Light extends AbstractDevice {

    public Light(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Light";
    }
}
