package Command;

interface Command {
    void execute();
}

//concrete command
//LightOnCommand
class StartCommand implements Command {
    Comp comp;

    public StartCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.on();
    }
}

class ShutDownCommand implements Command {
    Comp comp;

    public ShutDownCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.on();
    }
}

class ResetCommand implements Command {
    Comp comp;

    public ResetCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.on();
    }
}

//receiver
//light
class Comp {
    void on() {
        System.out.println("comp is starting");
    }

    void off() {
        System.out.println("comp is shutting down");
    }

    void reset() {
        System.out.println("comp is resetting");
    }

}

//invoker
//remoteControl
public class User {
    Command command;

    public User() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    void executeCommand() {
        command.execute();
    }
}

//client
//remoteControlTest
class Test {
    public static void main(String[] args) {
        Comp comp = new Comp();
        User user = new User();
        Command startCommand = new StartCommand(comp);

        user.setCommand(startCommand);
        user.executeCommand();
    }
}

