package Command.mysimpleremote;

public class RemoteControlTest {
    public static void main(String[] args) {
        GarageDoor garageDoor = new GarageDoor();
        RemoteControl remoteControl = new RemoteControl();
        GarageDoorOpenCommand command = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(command);
        remoteControl.buttonWasPressed();

        GarageDoorCloseCommand garageDoorCloseCommand=new GarageDoorCloseCommand(garageDoor);
        remoteControl.setCommand(garageDoorCloseCommand);
        remoteControl.buttonWasPressed();
    }
}
