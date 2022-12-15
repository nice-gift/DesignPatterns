package Command.remotelyambda.client;

public class LivingRoomLight extends Light {
    public void onLight() {
        System.out.println("Light in living room is on");
    }

    public void offLight() {
        System.out.println("Light in living room is off");
    }
}
