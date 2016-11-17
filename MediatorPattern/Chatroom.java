package MediatorPattern;

/**
 * Created by xhon on 16-11-17.
 */
import java.util.Date;
public class Chatroom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + user.getName() + ": " + message);
    }
}
