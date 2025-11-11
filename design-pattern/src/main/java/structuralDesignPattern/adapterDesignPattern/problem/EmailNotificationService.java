package structuralDesignPattern.adapterDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

// legacy email notification service
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String recipient, String subject, String message) {
        // Simulate sending email
        System.out.println(
            "Email sent to " + recipient + " with subject: " + subject + " with message: " + message);
    }
}
