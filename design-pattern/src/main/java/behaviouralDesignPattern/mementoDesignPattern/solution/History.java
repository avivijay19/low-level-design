package behaviouralDesignPattern.mementoDesignPattern.solution;

import behaviouralDesignPattern.mementoDesignPattern.problem.TextEditor;
import java.util.Stack;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

// Manages the history of Editor states (Basically snapshots of text editor states)
public class History {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.getContent());
    }

    public EditorMemento undo(TextEditor textEditor) {
        if (!history.isEmpty()) {
            textEditor.setContent(history.pop().getContent());
        }
        return null;
    }
}
