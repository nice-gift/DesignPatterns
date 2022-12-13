package Command.remote;

public class RemoteControl {
    Command[] commandOn;
    Command[] commandOff;

    public RemoteControl() {
        commandOn = new Command[7];
        commandOff = new Command[7];

        Command noCommand = new noCommand();
        for (int i = 0; i < commandOn.length; i++) {
            commandOn[i] = noCommand;
            commandOff[i] = noCommand;
        }
    }

    public void setCommand(int i, Command commandOn, Command commandOff) {
        this.commandOn[i] = commandOn;
        this.commandOff[i] = commandOff;
    }

    public void onButtonWasPushed(int i) {
        commandOn[i].execute();
    }

    public void offButtonWasPushed(int i) {
        commandOff[i].execute();
    }


    public String toString() {
        StringBuffer buffer = new StringBuffer("***Remote control***\n");
        for (int i = 0; i < commandOn.length; i++) {
            buffer.append("[slot ").append(i).append("]\t").append(commandOn[i].
                    getClass().getName()).append("\t").append(commandOff[i].getClass().getName()).append("\n");
        }
        return buffer+"";
    }
}
