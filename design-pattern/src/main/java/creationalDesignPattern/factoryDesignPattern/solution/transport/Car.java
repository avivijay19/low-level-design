package creationalDesignPattern.factoryDesignPattern.solution.transport;

import creationalDesignPattern.factoryDesignPattern.solution.Transport;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public class Car extends Transport {
    @Override
    public void transport() {
        System.out.println("Car Transporting");
    }
}
