package behaviouralDesignPattern.commandDesignPattern.problem.classes;

import behaviouralDesignPattern.commandDesignPattern.problem.TextEditor;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class BoldButton {
    private final TextEditor textEditor;

    public BoldButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.boldText();
    }
}
