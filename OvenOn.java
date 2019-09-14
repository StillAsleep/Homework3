public class OvenOn implements ICommand{
    
    private Oven oven;

    public OvenOn(Oven o) {
        oven = o;
    }

    @Override
    public void execute(){
        System.out.println("Turning on Oven");
        oven.turnOn();
    }
}