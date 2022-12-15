package Command.macro;

import Command.macro.client.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.offLight();
    }

    @Override
    public void undo() {
        light.onLight();
    }
}
