package estructurales.Decorator;

/**
 * Created by leandro on 7/1/17.
 */
public class DecoratorDemo {
    /*
        Agregar dinámicamente responsabilidades (funcionalidad) extra a un objeto. Es
        una forma flexible que sirve de alternativa a subclassing para extender funcionalidad.
     */

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
