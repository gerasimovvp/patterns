public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String room;
    int speed;

    public CeilingFan(String room){
        this.room = room;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println("Ceiling fan in " + room + " is high!");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println("Ceiling fan in " + room + " is medium!");
    }

    public void low(){
        speed = LOW;
        System.out.println("Ceiling fan in " + room + " is low!");
    }

    public void off(){
        speed = OFF;
        System.out.println("Ceiling fan in " + room + " is off!");
    }

    public int getSpeed(){
        return speed;
    }

    public void on(){
        System.out.println("Ceiling fan in " + room + " is on!");
    }    
}
