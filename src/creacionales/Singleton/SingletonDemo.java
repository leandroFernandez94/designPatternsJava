package creacionales.Singleton;

/**
 * Created by leandro on 7/2/17.
 */
public class SingletonDemo {

    /*
        Asegurar que una clase sólo tenga una única instancia, y brindar un acceso
        global a la misma.

        Ventaja:
            ● Performance: no se crean instancias innecesarias.
        Desventajas:
            ● Queda muy acoplado al sistema. Sacar un singleton de un sistema puede ser
            costoso debido a que el acceso es global.
            ● En entornos multi-threading puede generar deadlocks.
     */

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
