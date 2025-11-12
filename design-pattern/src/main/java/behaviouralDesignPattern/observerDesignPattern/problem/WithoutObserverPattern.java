package behaviouralDesignPattern.observerDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice displayDevice = new DisplayDevice();
        WeatherStation weatherStation = new WeatherStation(displayDevice);

//        Tight coupling between WeatherStation and DisplayDevice
        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);
    }
}
