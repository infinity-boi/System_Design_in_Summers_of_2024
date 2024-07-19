package GS09_DesignPatterns.BehavioralDP.CommandDP.Command;

import java.util.Stack;

public class History {
    private Stack<Command> commandStack = new Stack<>();

    public void push(Command command) {
        commandStack.push(command);
    }

    public Command pop() {
        return commandStack.pop();
    }

    public boolean isEmpty() {
        return commandStack.isEmpty();
    }
}

