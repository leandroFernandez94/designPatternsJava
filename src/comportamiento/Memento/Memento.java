package comportamiento.Memento;

/**
 * Created by leandro on 7/2/17.
 */

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
