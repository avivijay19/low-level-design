package behaviouralDesignPattern.mediatorDesignPattern.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class ChatRoom implements ChatMediator {

    private final List<ChatUser> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessages(String message, ChatUser receiver) {
        for (ChatUser user : users) {
            if (!user.equals(receiver)) {
                user.receiveMessage(receiver, message);
            }
        }
    }

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }

}
