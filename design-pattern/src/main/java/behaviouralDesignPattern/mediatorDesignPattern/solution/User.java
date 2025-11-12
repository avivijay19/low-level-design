package behaviouralDesignPattern.mediatorDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(User receiver, String message) {
        System.out.println(this.name + " sends message to " + receiver.name + ": " + message);
    }

    public String getName() {
        return name;
    }
}
