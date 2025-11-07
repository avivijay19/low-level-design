package creationalDesignPattern.abstractFactoryDesignPattern.solution.factory;

import creationalDesignPattern.abstractFactoryDesignPattern.solution.Button;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.ScrollBar;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public interface UIFactory {
    Button createButton();
    ScrollBar createScrollBar();
}
