package behaviouralDesignPattern.strategyDesignPattern.solution.concertStrategy;

import behaviouralDesignPattern.strategyDesignPattern.solution.PaymentStrategy;

/**
 * @author : avinashvijayvargiya
 * @created : 06/11/25, Thursday
 **/

public class CreditCard implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
