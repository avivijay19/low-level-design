package behaviouralDesignPattern.commandDesignPattern.problem.classes;

import behaviouralDesignPattern.commandDesignPattern.problem.TextEditor;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class ItalicButton {
    private final TextEditor textEditor;

    public ItalicButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.italicText();
    }
}
