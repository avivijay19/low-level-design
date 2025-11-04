package creationalDesignPattern.builderDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 04/11/25, Tuesday
 **/

public class WithoutBuilderPattern {
    public static void main(String[] args) {
        House house =
            new House("Concrete Foundation", "Wooden Structure", "Shingle Roof", true, false, true);
        System.out.println(house);
    }
}
