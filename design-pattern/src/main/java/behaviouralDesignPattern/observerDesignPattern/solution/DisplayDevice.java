package behaviouralDesignPattern.observerDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class DisplayDevice implements Observer {

    private final String deviceName;

    public DisplayDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(float temperature) {
        System.out.println(deviceName + " Display: Temperature updated to " + temperature + "°C");
    }
}
