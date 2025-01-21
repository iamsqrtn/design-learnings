package pattern.structural.bridge.without;

public class Truck extends Vehicle {
    @Override
    public void applyBrake() {
        System.out.println("Truck Brake Applied");
    }
}
