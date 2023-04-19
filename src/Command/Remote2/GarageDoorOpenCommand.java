package Command.Remote2;

public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    @Override
    public void execute() {
        door.openDoor();
    }

    @Override
    public void undo() {
        door.closeDoor();
    }
}
