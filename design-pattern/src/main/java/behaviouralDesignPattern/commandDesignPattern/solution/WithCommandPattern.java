package behaviouralDesignPattern.commandDesignPattern.solution;

import behaviouralDesignPattern.commandDesignPattern.solution.command.BoldCommand;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        Button boldButton = new Button(new BoldCommand(textEditor)); // Command is encapsulated within the Button
        boldButton.click();

    }
}
