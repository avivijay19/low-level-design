package behaviouralDesignPattern.mediatorDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public interface ChatMediator {
    void sendMessages(String message, ChatUser receiver);
    void addUser(ChatUser user);
}
