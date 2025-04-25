public class HottubOnCommand implements Command{
    Hottub hottub;

    public HottubOnCommand(Hottub hottub){
        this.hottub = hottub;
    }

    public void execute(){
        hottub.setTemperature(144);
        hottub.bubble();
    }

    public void undo(){
        hottub.off();
    }
}
