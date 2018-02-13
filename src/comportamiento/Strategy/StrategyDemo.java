package comportamiento.Strategy;

/**
 * Created by leandro on 7/2/17.
 */
public class StrategyDemo {
    /*
    Propósito​: Definir una familia de algoritmos, encapsularlos y hacerlos intercambiables.
Permite a las clases cliente cambiar el algoritmo en tiempo de ejecución.
     */

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
