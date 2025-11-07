package creationalDesignPattern.factoryDesignPattern.solution;

import creationalDesignPattern.factoryDesignPattern.solution.transport.Aeroplane;
import creationalDesignPattern.factoryDesignPattern.solution.transport.Bike;
import creationalDesignPattern.factoryDesignPattern.solution.transport.Bus;
import creationalDesignPattern.factoryDesignPattern.solution.transport.Car;

/**
 * @author : avinashvijayvargiya
 * @created : 01/11/25, Saturday
 **/

public class TransportFactory {
    public Transport transport(String transportType) {
        return switch (transportType.toLowerCase()) {
            case "car" -> new Car();
            case "bus" -> new Bus();
            case "aeroplane" -> new Aeroplane();
            case "bike" -> new Bike();
            default ->
                throw new IllegalArgumentException("Invalid transport type: " + transportType);
        };
    }
}
