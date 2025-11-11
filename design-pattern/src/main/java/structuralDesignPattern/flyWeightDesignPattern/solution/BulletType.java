package structuralDesignPattern.flyWeightDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class BulletType {
    private final String color; // intrinsic property --> will be same for many bullets at a time

    public BulletType(String color) {
        this.color = color;
        System.out.println("Creating bullet type of color: " + color);
    }

    public String getColor() {
        return color;
    }
}
