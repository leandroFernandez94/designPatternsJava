package comportamiento.Strategy;

/**
 * Created by leandro on 7/2/17.
 */

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
