package comportamiento.Observer;

/**
 * Created by leandro on 7/2/17.
 */
public class ObserverDemo {

    /*
    Definir dependencias one-to-many entre objetos, de forma tal que cuando un
    objeto cambia su estado todos los objetos dependientes son notificados y actualizados
    inmediatamente.

    Ventajas
    ● Ayuda a desacoplar.
    ● Mejora la performance, ya que el observer no tiene que hacer poll para verificar si hay cambios.

    Observer pattern uses three actor classes. Subject, Observer and Client.
    Subject is an object having methods to attach and detach observers to a client object.
    We have created an abstract class Observer and a concrete class Subject that is extending class Observer.

     */

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
