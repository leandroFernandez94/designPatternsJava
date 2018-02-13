package estructurales.Facade;

/**
 * Created by leandro on 7/2/17.
 */
public class FacadeDemo {

    /*
        Propósito: Proveer una interfaz unificada a un set de interfaces en un subsistema. Define
        una interfaz de más alto nivel para simplificar el uso del sistema.

        Ventaja
            ● Simplifica el modelo quitando visibilidad de métodos del subsistema que no se usan
            en clases cliente.
            ● Permite dividir el sistema en capas.
     */

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
