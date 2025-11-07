package behaviouralDesignPattern.stateDesignPattern.solution;


/**
 * @author : avinashvijayvargiya
 * @created : 05/11/25, Wednesday
 **/

public class DirectionService {
    TransportMode transportMode;

    public DirectionService(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    public void setTransportationMode(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

//    Delegating work to the current transport mode
    public int getEta() {
        return transportMode.getEta();
    }

    public String getDirection() {
        return transportMode.getDirection();
    }
}
