public class GarageDoorUpCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.open();
    }

    public void undo(){
        garageDoor.close();
    }
}
