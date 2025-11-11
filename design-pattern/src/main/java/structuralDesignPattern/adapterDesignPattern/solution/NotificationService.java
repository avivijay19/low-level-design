package structuralDesignPattern.adapterDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public interface NotificationService {
    void sendNotification(String recipient, String subject, String message);
}
