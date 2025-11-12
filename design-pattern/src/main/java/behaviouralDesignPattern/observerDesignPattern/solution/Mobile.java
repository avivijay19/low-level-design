package behaviouralDesignPattern.observerDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class Mobile implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Mobile Display: Temperature updated to " + temperature + "°C");
    }
}
