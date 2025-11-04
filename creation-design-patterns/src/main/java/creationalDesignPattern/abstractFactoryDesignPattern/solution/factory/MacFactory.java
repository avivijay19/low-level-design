package creationalDesignPattern.abstractFactoryDesignPattern.solution.factory;


import creationalDesignPattern.abstractFactoryDesignPattern.solution.Button;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.MacButton;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.MacScrollBar;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.ScrollBar;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }
}
