package structuralDesignPattern.flyWeightDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class Bullet {
    private final int x, y, velocity; // extrinsic property --> can have different values

    private final String color; // intrinsic property --> will be same for many bullets at a time

    public Bullet(int x, int y, int velocity, String color) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.color = color;
        System.out.println("Creating bullet of color: " + color);
    }

    public void display() {
        System.out.println(
            "Bullet at (" + x + ", " + y + ") with color: " + color + "and velocity: " + velocity);
    }
}
