package comportamiento.State;

/**
 * Created by leandro on 7/2/17.
 */
public class StateDemo {
    /*
        Permitir que un objeto altere su comportamiento cuando su estado interno
        cambia. Permite modelar las transiciones entre estados.

        Ventajas
        ● Desacoplamiento
        ● Mantenimiento
        ● Instancias de objetos State se pueden compartir.
     */

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
