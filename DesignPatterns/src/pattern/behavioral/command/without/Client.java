package pattern.behavioral.command.without;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
    }
}
