package behaviouralDesignPattern.stateDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 05/11/25, Wednesday
 **/

public class DirectionService {
    private TransportationMode mode;

    public DirectionService(TransportationMode mode) {
        this.mode = mode;
    }

    public TransportationMode getMode() {
        return mode;
    }

    public void setMode(TransportationMode mode) {
        this.mode = mode;
    }

    public int getEta() {
        return switch (mode) {
            case WALKING -> {
                System.out.println("Calculating ETA for walking...");
                yield 30;
            }
            case BICYCLING -> {
                System.out.println("Calculating ETA for bicycling...");
                yield 15;
            }
            case DRIVING -> {
                System.out.println("Calculating ETA for driving...");
                yield 10;
            }
            default -> throw new IllegalArgumentException("Invalid transportation mode: " + mode);
        };
    }

    public String getDirection() {
        return switch (mode) {
            case WALKING -> {
                System.out.println("Getting directions for walking...");
                yield "Walk straight for 1 km, then turn right.";
            }
            case BICYCLING -> {
                System.out.println("Getting directions for bicycling...");
                yield "Bike straight for 2 km, then turn left.";
            }
            case DRIVING -> {
                System.out.println("Getting directions for driving...");
                yield "Drive straight for 5 km, then take the exit.";
            }
            default -> throw new IllegalArgumentException("Invalid transportation mode: " + mode);
        };
    }
}
