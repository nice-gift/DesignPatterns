package Command.mysimpleremote;

public class RemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    void buttonWasPressed() {
        command.execute();
    }
}
