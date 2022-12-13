package Command.remote;

import Command.remote.client.Stereo;

public class StereoOff implements Command {
    Stereo stereo;

    public StereoOff(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.offStereo();
    }
}
