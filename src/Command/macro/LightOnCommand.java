package Command.macro;

import Command.macro.client.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.onLight();
    }

    @Override
    public void undo() {
        light.offLight();
    }
}
