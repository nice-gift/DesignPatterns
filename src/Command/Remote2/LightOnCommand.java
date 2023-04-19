package Command.Remote2;

public class LightOnCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
