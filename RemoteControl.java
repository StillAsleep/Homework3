public class RemoteControl{

    ICommand command;

    public void setCommand(ICommand button){
        command = button;
    }

    public void pressButton() {
        command.execute();
    }
}