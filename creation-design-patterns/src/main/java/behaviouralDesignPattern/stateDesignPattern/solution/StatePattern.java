package behaviouralDesignPattern.stateDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 05/11/25, Wednesday
 **/

public class StatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Plane());
        System.out.println("ETA: " + directionService.getEta() + " minutes");
        System.out.println("Direction: " + directionService.getDirection());

    }
}
