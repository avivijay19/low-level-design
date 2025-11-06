package behaviouralDesignPattern.strategyDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        paymentStrategy.pay(amount); // Polymorphic call
    }


}
