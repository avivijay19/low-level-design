package structuralDesignPattern.adapterDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class SendGridService {
    public void sendEmail(String to, String subject, String body) {
        // Simulate sending email via SendGrid
        System.out.println(
            "SendGrid email sent to " + to + " with subject: " + subject + " and body: " + body);
    }
}
