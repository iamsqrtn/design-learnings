package pattern.structural.bridge.with;

public class Truck extends Vehicle {
    Truck(BrakeSystem brakeSystem) {
        super(brakeSystem);
    }
    @Override
    public void applyBrake() {
        brakeSystem.brake();
    }
}
