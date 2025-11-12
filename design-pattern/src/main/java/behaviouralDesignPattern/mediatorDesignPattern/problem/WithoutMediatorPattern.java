package behaviouralDesignPattern.mediatorDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class WithoutMediatorPattern {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Direct communication between users
        user1.sendMessage(user2, "Hello Bob!");
        user2.sendMessage(user1, "Hi Alice!");
    }
}
