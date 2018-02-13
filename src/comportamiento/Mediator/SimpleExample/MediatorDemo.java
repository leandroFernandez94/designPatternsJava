package comportamiento.Mediator.SimpleExample;

/**
 * Created by leandro on 7/2/17.
 */
public class MediatorDemo {

    /*
        Propósito​: Definir un objeto que encapsula cómo un set de objetos interactúan. Provee bajo
        acoplamiento ta que se evita que los objetos se referencien entre sí explícitamente, y
        permite modificar la forma de interacción independientemente.

        ● Mediator sirve para desacoplar las clases Colaboradoras (Colleague) entre sí.
        ● Todas las colaboradoras conocen al mediator y el mediator conoce a todas las colaboradoras
        ● La comunicación está encapsulada en el mediador.
     */

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
