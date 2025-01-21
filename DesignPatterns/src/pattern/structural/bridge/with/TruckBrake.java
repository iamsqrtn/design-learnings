package pattern.structural.bridge.with;

public class TruckBrake extends BrakeSystem {
    @Override
    public void brake() {
        System.out.println("Truck Brake Applied");
    }
}
