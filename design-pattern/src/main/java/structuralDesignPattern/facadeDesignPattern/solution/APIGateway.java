package structuralDesignPattern.facadeDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class APIGateway {
    private final UserService userService;
    private final OrderService orderService;
    private final PaymentService paymentService;

    public APIGateway() {
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    public String handleRequest(String userId, String product, double amount) {
        String userDetails = userService.getUserDetails(userId);
        String orderConfirmation = orderService.placeOrder(userId, product);
        String paymentStatus = paymentService.processPayment(userId, amount);

        return userDetails + "\n" + orderConfirmation + "\n" + paymentStatus;
    }
}
