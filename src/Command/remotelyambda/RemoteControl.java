package Command.remotelyambda;


public class RemoteControl {
    Command[] commandOn;
    Command[] commandOff;
    String[] commandOnName;
    String[] commandOffName;

    public RemoteControl() {
        commandOn = new Command[7];
        commandOff = new Command[7];
        commandOnName = new String[7];
        commandOffName = new String[7];

        for (int i = 0; i < commandOn.length; i++) {
            commandOn[i] = () -> {
            };
            commandOff[i] = () -> {
            };
        }
    }

    public void setCommand(int i, Command commandOn, String name1, Command commandOff, String name2) {
        this.commandOn[i] = commandOn;
        this.commandOff[i] = commandOff;
        this.commandOnName[i] = name1;
        this.commandOffName[i] = name2;
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
            buffer.append("[slot ").append(i).append("]\t").append
                    (commandOnName[i]).append("\t").append(commandOffName[i]).append("\n");
        }
        return buffer + "";
    }
}
