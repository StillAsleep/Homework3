public class BakingDemo {

    public static void main(String[] args) {

        Mixer mixer = new Mixer();
        Oven oven = new Oven();
        MixerOn mixerOn = new MixerOn(mixer);
        MixerOff mixerOff = new MixerOff(mixer);
        OvenOn ovenOn = new OvenOn(oven);
        OvenOff ovenOff = new OvenOff(oven);
        OvenSetTemperature temp = new OvenSetTemperature(oven);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(mixerOn);
        remote.pressButton();
        remote.setCommand(mixerOff);
        remote.pressButton();
        remote.setCommand(ovenOn);
        remote.pressButton();
        remote.setCommand(ovenOff);
        remote.pressButton();
        remote.setCommand(temp);
        remote.pressButton();
    }
}