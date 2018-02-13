package comportamiento.Mediator.SimpleExample;

import java.util.Date;

/**
 * Created by leandro on 7/2/17.
 */

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
