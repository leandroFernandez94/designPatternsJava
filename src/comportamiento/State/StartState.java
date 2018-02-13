package comportamiento.State;

/**
 * Created by leandro on 7/2/17.
 */

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
