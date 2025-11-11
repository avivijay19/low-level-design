package structuralDesignPattern.adapterDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = new SendGridAdapter();
        notificationService.sendNotification("abc@gmail.com", "Welcome",
            "Thank you for registering!");
    }
}
