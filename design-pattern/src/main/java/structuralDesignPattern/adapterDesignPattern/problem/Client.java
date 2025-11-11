package structuralDesignPattern.adapterDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        notificationService.sendNotification("abc@gmail.com", "Welcome",
            "Thank you for registering!");
    }
}
