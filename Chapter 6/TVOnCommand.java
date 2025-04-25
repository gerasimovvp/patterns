public class TVOnCommand implements Command{
    TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    public void execute(){
        tv.on();
        tv.setChannel(6);
    }

    public void undo(){
        tv.off();
    }
}
