package structuralDesignPattern.facadeDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 10/11/25, Monday
 **/

public class UserService {
    public String getUserDetails(String userId) {
        // Simulate fetching user details from a database
        return "User Details for " + userId;
    }
}
