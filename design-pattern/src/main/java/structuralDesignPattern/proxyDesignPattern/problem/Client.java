package structuralDesignPattern.proxyDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

// Image getting loaded twice due to lack of proxy
// Introduce proxy with lazy loading and caching to solve this issue
public class Client {
    public static void main(String[] args) {
        Image image1 = new RealImage("photo.jpg");
        Image image2 = new RealImage("photo.jpg");

//        Here the real image was loaded twice from disk, every time display() was called, which could be insufficient for performance
        image1.display();
        image2.display();
    }
}
