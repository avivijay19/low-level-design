package behaviouralDesignPattern.commandDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class Button {
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
