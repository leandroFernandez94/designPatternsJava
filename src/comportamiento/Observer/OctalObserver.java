package comportamiento.Observer;

/**
 * Created by leandro on 7/2/17.
 */

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        super(subject);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
