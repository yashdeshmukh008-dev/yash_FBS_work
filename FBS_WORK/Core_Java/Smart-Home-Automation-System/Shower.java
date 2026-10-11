public class Shower extends AbstractDevice {

    public Shower(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Shower";
    }
}
