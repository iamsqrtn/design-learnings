package pattern.behavioral.command.with;

import java.util.Stack;

public class TVRemote {
    TVCommand tvCommand;
    Stack<TVCommand>commandStack = new Stack<>();
    TVRemote(TVCommand tvCommand) {
        this.tvCommand = tvCommand;
    }
    public void powerButton() {
        System.out.println("Pressed Power Button");
        commandStack.push(tvCommand);
        tvCommand.execute();
    }
    public void undoButton() {
        if(!commandStack.empty()) {
            TVCommand lastExecutedCommand = commandStack.pop();
            lastExecutedCommand.undo();
        }
    }
}
