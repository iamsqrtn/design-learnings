package pattern.behavioral.command.with;

public class TurnOffTVCommand implements TVCommand {
    TV tv;
    TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}
