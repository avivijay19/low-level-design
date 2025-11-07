package behaviouralDesignPattern.strategyDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CREDIT_CARD", 100.0);
        paymentService.processPayment("PAYPAL", 200.0);
        paymentService.processPayment("BITCOIN", 300.0);
    }
}
