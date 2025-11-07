package creationalDesignPattern.builderDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 04/11/25, Tuesday
 **/

public class WithBuilder {
    public static void main(String[] args) {
        House house = new House.Builder("Concrete", "Wooden", "Shingle")
            .setHasGarage(true)
            .setHasSwimmingPool(false)
            .setHasGarden(true)
            .build();

        System.out.println(house);
    }
}
