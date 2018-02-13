package comportamiento.Observer;

/**
 * Created by leandro on 7/2/17.
 */

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        super(subject);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
