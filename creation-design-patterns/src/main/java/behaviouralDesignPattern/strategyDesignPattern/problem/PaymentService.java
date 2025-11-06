package behaviouralDesignPattern.strategyDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class PaymentService {
    public void processPayment(String paymentMethod, double amount) {
        switch (paymentMethod) {
            case "CREDIT_CARD" ->
                System.out.println("Processing credit card payment of $" + amount);
            case "PAYPAL" ->
                System.out.println("Processing PayPal payment of $" + amount);
            case "BITCOIN" ->
                System.out.println("Processing Bitcoin payment of $" + amount);
            default -> System.out.println("Unsupported payment method: " + paymentMethod);
        }
    }
}
