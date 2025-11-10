package behaviouralDesignPattern.mementoDesignPattern.problem;

import behaviouralDesignPattern.mementoDesignPattern.solution.EditorMemento;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class TextEditor {
    private String content;

    public EditorMemento getContent() {
        return new EditorMemento(content);
    }

    public void setContent(String content) {
        this.content = content;
    }
}
