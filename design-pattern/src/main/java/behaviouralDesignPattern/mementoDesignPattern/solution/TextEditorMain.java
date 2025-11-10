package behaviouralDesignPattern.mementoDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class TextEditorMain {
    public static void main(String[] args) {
        behaviouralDesignPattern.mementoDesignPattern.problem.TextEditor textEditor =
            new behaviouralDesignPattern.mementoDesignPattern.problem.TextEditor();
        History history = new History(); // Manages the history of states


        textEditor.setContent("Hello, World!");
        history.saveState(textEditor); // Save state
        textEditor.setContent("Hello, Design Patterns!");
        history.saveState(textEditor);
//        Problem: No way to revert to previous state
        System.out.println("Current Content: " + textEditor.getContent().toString());
        history.undo(textEditor); // Undo to previous state
        System.out.println("After Undo Content: " + textEditor.getContent().toString());
    }
}
