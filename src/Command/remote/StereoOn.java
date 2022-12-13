package Command.remote;

import Command.remote.client.Stereo;

public class StereoOn implements Command {
    Stereo stereo;

    public StereoOn(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
