package Command.Remote2;

public class RemoteControl {
    Command[] commandsOn;
    Command[] commandsOff;
    Command undoCommand;

    public RemoteControl(int size) {
        commandsOn = new Command[size];
        commandsOff = new Command[size];

        undoCommand = new NoCommand();
        for (int i = 0; i < commandsOn.length; i++) {
            commandsOn[i] = new NoCommand();
            commandsOff[i] = new NoCommand();
        }
    }

    public void setCommands(int i, Command commandOn, Command commandOff) {
        commandsOn[i] = commandOn;
        commandsOff[i] = commandOff;
    }

    public void onButtonWasPushed(int i) {
        commandsOn[i].execute();
        undoCommand = commandsOn[i];
    }

    public void offButtonWasPushed(int i) {
        commandsOff[i].execute();
        undoCommand = commandsOff[i];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("------------Remote Control------------\n");
        for (int i = 0; i < commandsOn.length; i++) {
            builder.append("slot " + i + ": " + commandsOn[i].getClass().getName() + "\t" + commandsOff[i].getClass().getName()+"\n");
        }
        return builder.toString();
    }
}
