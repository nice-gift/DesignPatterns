package Command.remote;

import Command.remote.client.Light;

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
