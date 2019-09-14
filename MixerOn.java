public class MixerOn implements ICommand{
    
    private Mixer mixer;

    public MixerOn(Mixer m) {
        mixer = m;
    }

    @Override
    public void execute(){
        System.out.println("Turning on Mixer");
        mixer.turnOn();
    }
}