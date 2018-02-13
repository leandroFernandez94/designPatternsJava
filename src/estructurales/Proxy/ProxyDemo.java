package estructurales.Proxy;

/**
 * Created by leandro on 7/2/17.
 */
public class ProxyDemo {

    /*
        Proveer un sustituto de otro objeto para controlar el acceso al mismo.

        Tipos de proxies:
        ● Remote proxy: representación local de un objeto remoto
        ● Virtual proxy: para crear objetos costosos on-demand.
        ● Protection proxy: controlar el acceso al objeto real. Se usa cuando hay diferentes
            permisos/políticas de acceso.
        ● Smart Reference: se usa como reemplazo de los punteros comunes, agregando
            acciones adicionales cuando se accede a un objeto. (esto es más de bajo nivel).
     */

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
