package behaviouralDesignPattern.stateDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 05/11/25, Wednesday
 **/

public class Cycle implements TransportMode {
    @Override
    public int getEta() {
        return 15;
    }

    @Override
    public String getDirection() {
        return "Cycle: Head straight for 200 meters, then turn right.";
    }
}
