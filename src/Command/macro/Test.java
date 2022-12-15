package Command.macro;

import Command.macro.client.KitchenLight;
import Command.macro.client.Light;
import Command.macro.client.LivingRoomLight;
import Command.macro.client.Stereo;

public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light kitchenLight = new KitchenLight();
        Light livingRoomLight = new LivingRoomLight();
        Stereo stereo = new Stereo();

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = {kitchenLightOnCommand, livingRoomLightOnCommand, stereoOn};
        Command[] partyOff = {kitchenLightOffCommand, kitchenLightOffCommand, stereoOff};

        MacroCommand macroCommandPartyOn = new MacroCommand(partyOn);
        MacroCommand macroCommandPartyOff = new MacroCommand(partyOff);

        remoteControl.setCommand(0, macroCommandPartyOn, macroCommandPartyOff);


        System.out.println(remoteControl);

        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("\n --- Pushing Macro On---");
        remoteControl.offButtonWasPushed(0);

        System.out.println("\n--- Pushing Macro Undo---");
        remoteControl.undoButtonWasPushed();
    }
}
