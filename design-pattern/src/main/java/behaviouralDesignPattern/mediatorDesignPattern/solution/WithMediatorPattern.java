package behaviouralDesignPattern.mediatorDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class WithMediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        ChatUser user1 = new ChatUser("Alice", chatMediator);
        ChatUser user2 = new ChatUser("Bob", chatMediator);

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);

        user2.sendMessage("Hello");
    }
}
