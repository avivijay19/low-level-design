package structuralDesignPattern.facadeDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        String userId = "U123";
        String product = "Laptop";
        double amount = 75000.00;

        String userDetails = userService.getUserDetails(userId);
        String orderConfirmation = orderService.placeOrder(userId, product);
        String paymentConfirmation = paymentService.processPayment(userId, amount);

        System.out.println(userDetails);
        System.out.println(orderConfirmation);
        System.out.println(paymentConfirmation);
    }
}
