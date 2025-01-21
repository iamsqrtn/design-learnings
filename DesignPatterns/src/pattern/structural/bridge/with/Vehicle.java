package pattern.structural.bridge.with;

public abstract class Vehicle {
    BrakeSystem brakeSystem;

    public Vehicle(BrakeSystem brakeSystem) {
        this.brakeSystem = brakeSystem;
    }

    public abstract void applyBrake();
}
