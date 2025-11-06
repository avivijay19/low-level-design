package behaviouralDesignPattern.commandDesignPattern.problem;

import behaviouralDesignPattern.commandDesignPattern.problem.classes.BoldButton;
import behaviouralDesignPattern.commandDesignPattern.problem.classes.ItalicButton;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class WithoutCommandPattern {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        BoldButton boldButton = new BoldButton(textEditor);
        ItalicButton italicButton = new ItalicButton(textEditor);

        // Simulating button clicks which are tightly coupled with TextEditor methods
        boldButton.click();
        italicButton.click();
    }
}
