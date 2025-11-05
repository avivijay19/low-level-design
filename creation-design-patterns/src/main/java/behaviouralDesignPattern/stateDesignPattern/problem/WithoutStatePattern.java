package behaviouralDesignPattern.stateDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 05/11/25, Wednesday
 **/

public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.WALKING);
        directionService.setMode(TransportationMode.DRIVING);
        directionService.getEta();
        directionService.getDirection();
    }
}
