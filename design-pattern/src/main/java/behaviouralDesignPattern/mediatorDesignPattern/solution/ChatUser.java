package behaviouralDesignPattern.mediatorDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class ChatUser {
    private final String name;

    private final ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " sends message to " + message);
        chatMediator.sendMessages(message, this);
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(ChatUser receiver, String message) {
        System.out.println(this.name + " received message from " + receiver.name + ": " + message);
    }
}
