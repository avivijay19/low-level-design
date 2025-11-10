package structuralDesignPattern.facadeDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class OrderService {
    public String placeOrder(String userId, String product) {
        // Simulate placing an order
        return "Order placed for " + product + " by user " + userId;
    }
}
