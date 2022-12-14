package Command.undo;

public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan();

        CeilingFanHighSpeedCommand ceilingFanHighSpeedCommand = new CeilingFanHighSpeedCommand(ceilingFan);
        CeilingFanMediumSpeedCommand ceilingFanMediumSpeedCommand = new CeilingFanMediumSpeedCommand(ceilingFan);
        CeilingFanLowSpeedCommand ceilingFanLowSpeedCommand = new CeilingFanLowSpeedCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanHighSpeedCommand,ceilingFanOffCommand);
        remoteControl.setCommand(1,ceilingFanMediumSpeedCommand,ceilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);
    }
}
