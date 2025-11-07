package behaviouralDesignPattern.stateDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 05/11/25, Wednesday
 **/

public class Plane implements TransportMode {
    @Override
    public int getEta() {
        return 2;
    }

    @Override
    public String getDirection() {
        return "Plane: Proceed to the airport and board your flight.";
    }
}
