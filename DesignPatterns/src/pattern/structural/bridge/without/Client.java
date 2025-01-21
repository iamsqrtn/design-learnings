package pattern.structural.bridge.without;

public class Client {
    public static void main(String[] args) {
        Vehicle carVehicle = new Car();
        carVehicle.applyBrake();
        Vehicle truckVehicle = new Truck();
        truckVehicle.applyBrake();
    }
}
