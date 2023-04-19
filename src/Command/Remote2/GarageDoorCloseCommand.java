package Command.Remote2;

public class GarageDoorCloseCommand implements Command {
    GarageDoor door;

    @Override
    public void execute() {
        door.closeDoor();
    }

    @Override
    public void undo() {
        door.openDoor();
    }
}
