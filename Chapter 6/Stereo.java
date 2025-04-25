public class Stereo {
    String room;

    public Stereo(String room){
        this.room = room;
    }

    public void on(){
        System.out.println("Stereo in " + room + " is on!");
    }

    public void off(){
        System.out.println("Stereo in " + room + " is off!");
    }

    public void setCD(){
        System.out.println("CD is set!");
    }

    public void setVolume(int volume){
        System.out.println("Volume is set to " + volume);
    }
}
