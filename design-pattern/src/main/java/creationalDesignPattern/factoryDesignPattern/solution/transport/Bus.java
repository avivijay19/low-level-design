package creationalDesignPattern.factoryDesignPattern.solution.transport;

import creationalDesignPattern.factoryDesignPattern.solution.Transport;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public class Bus extends Transport {

    @Override
    public void transport() {
        System.out.println("Bus Transporting");
    }
}
