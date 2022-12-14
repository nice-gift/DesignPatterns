package Command.undo;

public class CeilingFanMediumSpeedCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanMediumSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.setMedium();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.setHigh();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.setMedium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.setLow();
        } else {
            ceilingFan.setOff();
        }
    }
}
