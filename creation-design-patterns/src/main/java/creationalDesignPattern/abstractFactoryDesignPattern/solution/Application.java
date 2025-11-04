package creationalDesignPattern.abstractFactoryDesignPattern.solution;

import creationalDesignPattern.abstractFactoryDesignPattern.solution.factory.MacFactory;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.factory.UIFactory;
import creationalDesignPattern.abstractFactoryDesignPattern.solution.factory.WindowsFactory;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public class Application {
    private final ScrollBar scrollBar;

    private final Button button;

    public Application(UIFactory uiFactory) {
        this.scrollBar = uiFactory.createScrollBar();
        this.button = uiFactory.createButton();
    }

    public static void main(String[] args) {
        System.out.println("....Starting Windows Application....");

        WindowsFactory windowsFactory = new WindowsFactory();
        Application app = new Application(windowsFactory);
        app.renderUI();

        System.out.println("....Starting Mac Application....");

        MacFactory macFactory = new MacFactory();
        Application app1 = new Application(macFactory);
        app1.renderUI();
    }

    public void renderUI() {
        scrollBar.scroll();
        button.render();
    }

}
