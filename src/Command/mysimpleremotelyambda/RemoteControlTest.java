package Command.mysimpleremotelyambda;

public class RemoteControlTest {
    public static void main(String[] args) {
        GarageDoor garageDoor = new GarageDoor();
        RemoteControl remoteControl = new RemoteControl();

//        лямбда
//        remoteControl.setCommand(() -> garageDoor.open());

//        ссылка на метод - method reference
        remoteControl.setCommand(garageDoor::open);
        remoteControl.buttonWasPressed();


//        remoteControl.setCommand(() -> garageDoor.close());
        remoteControl.setCommand(garageDoor::close);
        remoteControl.buttonWasPressed();
    }
}
