package behaviouralDesignPattern.observerDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class WeatherStation {
    private float temperature;

    private final DisplayDevice displayDevice; // Can be multiple devices

    public WeatherStation(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyDisplayDevice();
    }

    private void notifyDisplayDevice() {
        displayDevice.showTemperature(temperature);
    }
}
