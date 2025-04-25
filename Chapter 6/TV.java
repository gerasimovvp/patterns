public class TV {
    String room;

    public TV(String room){
        this.room = room;
    }

    public void on(){
        System.out.println("TV in " + room + " is on!");
    }

    public void setChannel(int channel){
        System.out.println("TV in " + room + " is set to " + channel + " channel!");
    }

    public void off(){
        System.out.println("TV in " + room + " is off!");
    }
}
