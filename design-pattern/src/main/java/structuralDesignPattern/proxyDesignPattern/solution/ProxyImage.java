package structuralDesignPattern.proxyDesignPattern.solution;

import structuralDesignPattern.proxyDesignPattern.problem.RealImage;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class ProxyImage implements Image {

    private final String fileName;

    private RealImage realImage; // Reference to the real image

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage =
                new RealImage(fileName); // Load the real image only when needed and cache it
        }
        realImage.display(); // Delegate the display call to the real image
    }
}
