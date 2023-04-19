package Command.Remote2;

public class LightOffCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
