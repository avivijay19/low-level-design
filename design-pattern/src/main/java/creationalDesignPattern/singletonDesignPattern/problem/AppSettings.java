package creationalDesignPattern.singletonDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 04/11/25, Tuesday
 **/

public class AppSettings {
    private String apiKey;
    private String apiSecret;

    public AppSettings() {
        this.apiKey = "apiKey";
        this.apiSecret = "apiSecret";
    }
}
