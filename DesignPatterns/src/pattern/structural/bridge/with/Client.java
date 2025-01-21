package pattern.structural.bridge.with;

public class Client {
    public static void main(String[] args) {
        BrakeSystem carBrakeSystem = new CarBrake();
        Vehicle carVehicle = new Car(carBrakeSystem);
        carVehicle.applyBrake();
        BrakeSystem truckBrakeSystem = new TruckBrake();
        Vehicle truckVehicle = new Truck(truckBrakeSystem);
        truckVehicle.applyBrake();
    }
}
