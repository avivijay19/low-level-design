package behaviouralDesignPattern.mementoDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setContent("Hello, World!");
        textEditor.setContent("Hello, Design Patterns!");
//        Problem: No way to revert to previous state
        System.out.println("Current Content: " + textEditor.getContent());
    }
}
