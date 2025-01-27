package pattern.behavioral.command.without;

public class TV {
    boolean isOn;
    public void turnOn() {
        isOn = true;
        System.out.println("Turn On TV");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Turn Off TV");
    }
}
