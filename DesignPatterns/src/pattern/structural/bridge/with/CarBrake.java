package pattern.structural.bridge.with;

import javax.sound.midi.SysexMessage;

public class CarBrake extends BrakeSystem {
    @Override
    public void brake() {
        System.out.println("Car Brake Applied");
    }
}
