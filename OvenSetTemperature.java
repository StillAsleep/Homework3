public class OvenSetTemperature implements ICommand{

    private Oven oven;

    public OvenSetTemperature(Oven o) {
        oven = o;
    }

    @Override
    public void execute(){
        oven.setTemperature();
    }
}