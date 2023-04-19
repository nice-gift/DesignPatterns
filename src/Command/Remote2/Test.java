package Command.Remote2;

public class Test {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl(7);
        control.setCommands(0, new GarageDoorOpenCommand(), new GarageDoorCloseCommand());
        control.setCommands(1, new GarageDoorOpenCommand(), new GarageDoorCloseCommand());
        control.setCommands(2, new LightOnCommand(), new LightOffCommand());

//        System.out.println(control);

        control.onButtonWasPushed(1);
        control.onButtonWasPushed(2);

    }
}
