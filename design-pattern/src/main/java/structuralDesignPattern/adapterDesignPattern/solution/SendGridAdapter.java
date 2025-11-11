package structuralDesignPattern.adapterDesignPattern.solution;

import structuralDesignPattern.adapterDesignPattern.solution.NotificationService;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class SendGridAdapter implements NotificationService {

    private final SendGridService sendGridService;

    public SendGridAdapter() {
        this.sendGridService = new SendGridService();
    }

    @Override
    public void sendNotification(String recipient, String subject, String message) {
//        Convert the parameters to sendgrid format
        sendGridService.sendEmail(recipient, subject, message);
    }
}
