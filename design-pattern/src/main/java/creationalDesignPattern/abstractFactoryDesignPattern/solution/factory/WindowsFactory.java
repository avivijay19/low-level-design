package creationalDesignPattern.abstractFactoryDesignPattern.solution.factory;

import creationalDesignPattern.abstractFactoryDesignPattern.solution.Button;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.ScrollBar;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.WindowsButton;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.WindowsScrollBar;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}
