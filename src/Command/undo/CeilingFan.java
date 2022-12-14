package Command.undo;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed;

    public CeilingFan() {
        speed = OFF;
    }

    public void setHigh() {
        speed = HIGH;
        System.out.println("CeilingFan is on high");
    }

    public void setMedium() {
        speed = MEDIUM;
        System.out.println("CeilingFan is on medium");
    }

    public void setLow() {
        speed = LOW;
        System.out.println("CeilingFan is on low");
    }

    public void setOff() {
        speed = OFF;
        System.out.println("CeilingFan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
