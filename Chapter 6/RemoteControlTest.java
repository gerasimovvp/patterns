public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living room");
        LightOnCommand lightOn = new LightOnCommand(light);
        
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorDownCommand garageDoorOpenCommand = new GarageDoorDownCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
