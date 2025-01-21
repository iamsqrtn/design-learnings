package pattern.structural.bridge.without;

public class Car extends Vehicle {
    @Override
    public void applyBrake() {
        System.out.println("Car Brake Applied");
    }
}
