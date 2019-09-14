public class MixerOff implements ICommand{
    
    private Mixer mixer;

    public MixerOff(Mixer m) {
        mixer = m;
    }

    @Override
    public void execute(){
        System.out.println("Turning off Mixer");
        mixer.turnOff();
    }
}