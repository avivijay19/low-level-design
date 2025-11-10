package behaviouralDesignPattern.mementoDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class TextEditor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //    Save Current state of editor
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    //    Restore to previous state
    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }
}
