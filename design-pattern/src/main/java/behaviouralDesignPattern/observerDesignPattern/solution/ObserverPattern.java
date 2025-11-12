package behaviouralDesignPattern.observerDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

//      Create Subscribers
        DisplayDevice displayDevice = new DisplayDevice("Samsung LCD");
        Mobile mobile = new Mobile();

//      Attaching observers
        weatherStation.registerObserver(displayDevice);
        weatherStation.registerObserver(mobile);

//      Set temperature
        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

//        Remove an observer
        weatherStation.removeObserver(mobile);

        weatherStation.setTemperature(28.3f);
    }
}
