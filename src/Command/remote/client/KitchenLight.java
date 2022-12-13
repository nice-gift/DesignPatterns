package Command.remote.client;

public class KitchenLight extends Light{
   public void onLight() {
        System.out.println("Light in kitchen is on");
    }

    public void offLight() {
        System.out.println("Light in kitchen is off");
    }
}
