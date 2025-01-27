package pattern.behavioral.command.with;

public class TurnOnTVCommand implements TVCommand {
    TV tv;
    TurnOnTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}
