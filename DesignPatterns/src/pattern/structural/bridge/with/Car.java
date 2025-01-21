package pattern.structural.bridge.with;

public class Car extends Vehicle {
    Car(BrakeSystem brakeSystem) {
        super(brakeSystem);
    }

    @Override
    public void applyBrake() {
        brakeSystem.brake();
    }
}
