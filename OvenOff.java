public class OvenOff implements ICommand{
    
    private Oven oven;

    public OvenOff(Oven o) {
        oven = o;
    }

    @Override
    public void execute(){
        System.out.println("Turning off Oven");
        oven.turnOff();
    }
}