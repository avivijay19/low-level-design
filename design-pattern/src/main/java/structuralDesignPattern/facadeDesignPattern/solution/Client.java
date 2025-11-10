package structuralDesignPattern.facadeDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class Client {
    public static void main(String[] args) {
//        Client code interacting with the Facade
        APIGateway apiGateway = new APIGateway();
        String userId = "U123";
        String product = "Laptop";
        double amount = 75000.00;
        String response = apiGateway.handleRequest(userId, product, amount);
        System.out.println(response);
    }
}
