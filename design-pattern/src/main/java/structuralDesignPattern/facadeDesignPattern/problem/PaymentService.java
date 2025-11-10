package structuralDesignPattern.facadeDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class PaymentService {
    public String processPayment(String userId, double amount) {
        // Simulate payment processing
        return "Payment of ₹" + amount + " processed for user " + userId;
    }
}
