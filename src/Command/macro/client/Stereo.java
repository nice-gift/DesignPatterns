package Command.macro.client;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void setCD() {
        System.out.println("CD is input");
    }

    public void setVolume(int volume) {
        System.out.printf("Volume is %d\n", volume);
    }

    public void offStereo() {
        System.out.println("Stereo is off");
    }
}
