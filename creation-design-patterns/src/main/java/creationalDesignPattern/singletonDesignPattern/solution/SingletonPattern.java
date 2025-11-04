package creationalDesignPattern.singletonDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 04/11/25, Tuesday
 **/

public class SingletonPattern {
    public static void main(String[] args) {
        AppSettings settings1 = AppSettings.getInstance();
        AppSettings settings2 = AppSettings.getInstance();

        System.out.println("Are both instances the same? " + (settings1 == settings2));
    }
}
