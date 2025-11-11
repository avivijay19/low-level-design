package structuralDesignPattern.flyWeightDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

// Problems with current implementation:
// 1. Memory Consumption: Each bullet instance consumes memory for its intrinsic property (color) and could be image.
// 2. Performance Issues: Creating and destroying many bullet objects can lead to performance degradation due to frequent memory allocation and garbage collection.
public class Game {
    public static void main(String[] args) {
        Bullet bullet1 = new Bullet(10, 20, 30, "Red");
        bullet1.display();

        Bullet bullet2 = new Bullet(15, 25, 35, "Red");
        bullet2.display();

        Bullet bullet3 = new Bullet(20, 30, 40, "Blue");
        bullet3.display();
    }
}
