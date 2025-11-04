package creationalDesignPattern.singletonDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 04/11/25, Tuesday
 **/

public class WithoutSingleton {
    public static void main(String[] args) {
        AppSettings settings1 = new AppSettings();
        AppSettings settings2 = new AppSettings();

        System.out.println(
            "Are both settings instances the same? " + (settings1.equals(settings2)));
    }
}
