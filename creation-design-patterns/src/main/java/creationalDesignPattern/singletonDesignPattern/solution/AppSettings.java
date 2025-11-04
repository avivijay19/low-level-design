package creationalDesignPattern.singletonDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 04/11/25, Tuesday
 **/

public class AppSettings {
    //    Step 1 : private static AppSettings instance;
    private static AppSettings instance;

    private final String apiKey;

    private final String apiSecret;

    //    Step 2 : private constructor to prevent instantiation from outside
    private AppSettings() {
        this.apiKey = "apiKey";
        this.apiSecret = "apiSecret";
    }

    //    Step 3 : public static method to provide access to the instance
    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton class is not allowed");
    }
}
