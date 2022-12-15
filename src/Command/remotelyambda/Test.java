package Command.remotelyambda;

import Command.remotelyambda.client.LivingRoomLight;
import Command.remotelyambda.client.KitchenLight;
import Command.remotelyambda.client.Light;
import Command.remotelyambda.client.Stereo;

public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light kitchenLight = new KitchenLight();
        Light livingRoomLight = new LivingRoomLight();
        Stereo stereo = new Stereo();

        Command stereoOn = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        };

        Command[] commandsOn = {kitchenLight::onLight, livingRoomLight::onLight, stereoOn};
        MacroCommand partyOn = new MacroCommand(commandsOn);

        Command[] commandsOff = {kitchenLight::offLight, livingRoomLight::offLight, stereo::offStereo};
        MacroCommand partyOff = new MacroCommand(commandsOff);


        remoteControl.setCommand(0, partyOn, "partyOn", partyOff, "partyOff");

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        System.out.println();
        remoteControl.offButtonWasPushed(0);
    }
}
