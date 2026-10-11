public class Television extends AbstractDevice {

    public Television(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Television";
    }
}
