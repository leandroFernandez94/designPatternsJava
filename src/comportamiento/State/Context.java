package comportamiento.State;

/**
 * Created by leandro on 7/2/17.
 */

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}

