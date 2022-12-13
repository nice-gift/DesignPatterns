package Command.remote;

import Command.remote.client.KitchenLight;
import Command.remote.client.Light;
import Command.remote.client.LivingRoomLight;
import Command.remote.client.Stereo;

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

        StereoOn stereoOn = new StereoOn(stereo);
        StereoOff stereoOff = new StereoOff(stereo);

        remoteControl.setCommand(0, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(1, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(2, stereoOn, stereoOff);

        System.out.println(remoteControl);
    }
}
