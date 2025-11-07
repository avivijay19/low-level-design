package behaviouralDesignPattern.commandDesignPattern.solution.command;

import behaviouralDesignPattern.commandDesignPattern.solution.Command;
import behaviouralDesignPattern.commandDesignPattern.solution.TextEditor;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class BoldCommand implements Command {
    private final TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}
