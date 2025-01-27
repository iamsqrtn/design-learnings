package pattern.behavioral.command.with;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        TVCommand tvCommand = new TurnOnTVCommand(tv);
//        TVCommand tvCommand = new TurnOffTVCommand(tv);
        TVRemote tvRemote = new TVRemote(tvCommand);
        tvRemote.powerButton();
        tvRemote.undoButton();
    }
}
