package creationalDesignPattern.abstractFactoryDesignPattern.problem;

import creationalDesignPattern.abstractFactoryDesignPattern.problem.mac.MacButton;
import creationalDesignPattern.abstractFactoryDesignPattern.problem.mac.MacScrollBar;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public class Application {
    public static void main(String[] args) {
        MacButton macButton = new MacButton();
        macButton.render();

        MacScrollBar macScrollBar = new MacScrollBar();
        macScrollBar.scroll();
    }
}
