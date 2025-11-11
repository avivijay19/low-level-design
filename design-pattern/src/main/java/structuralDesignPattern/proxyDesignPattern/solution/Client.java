package structuralDesignPattern.proxyDesignPattern.solution;


/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

// Image getting loaded twice due to lack of proxy
// Introduce proxy with lazy loading and caching to solve this issue
public class Client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo.jpg");
        Image image2 = new ProxyImage("photo.jpg");

        image1.display(); // Create and load the real image
        image2.display(); // Use the cached real image (faster this time) -> was not loaded it was retrieved from cache
    }
}
