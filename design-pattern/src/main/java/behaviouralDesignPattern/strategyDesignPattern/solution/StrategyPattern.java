package behaviouralDesignPattern.strategyDesignPattern.solution;

import behaviouralDesignPattern.strategyDesignPattern.solution.concertStrategy.DebitCard;
import behaviouralDesignPattern.strategyDesignPattern.solution.concertStrategy.UPIPayment;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.processPayment(150);

        paymentService.setPaymentStrategy(new UPIPayment());
        paymentService.processPayment(250);
    }
}
