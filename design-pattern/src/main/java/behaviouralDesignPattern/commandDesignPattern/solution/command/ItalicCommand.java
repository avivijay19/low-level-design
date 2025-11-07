package behaviouralDesignPattern.commandDesignPattern.solution.command;

import behaviouralDesignPattern.commandDesignPattern.problem.TextEditor;
import behaviouralDesignPattern.commandDesignPattern.solution.Command;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class ItalicCommand implements Command {
    private final TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.italicText();
    }
}
