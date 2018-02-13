package creacionales.AbstractFactory;

import creacionales.AbstractFactory.Color.ColorInterface;
import creacionales.AbstractFactory.Shape.ShapeInterface;
import creacionales.AbstractFactory.factories.AbstractFactory;
import creacionales.AbstractFactory.factories.FactoryProducer;

/**
 * Created by leandro on 6/30/17.
 */
public class AbstractFactoryDemo {

    /*
       Proposito: Proveer una interfaz para la creación de familias de objetos relacionados, sin
        especificar la clase concreta.

        Se usa cuando se quiere cambiar (usar otra) implementación en tiempo de ejecución.

     */

    public static void main(String[] args) {
        //get shape factoyoushallnotpass
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        ShapeInterface shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        shape1.draw();

        //get an object of Shape Rectangle
        ShapeInterface shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        shape2.draw();

        //get an object of Shape Square
        ShapeInterface shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        ColorInterface color1 = colorFactory.getColor("RED");

        //call fill method of Red
        color1.fill();

        //get an object of Color Green
        ColorInterface color2 = colorFactory.getColor("Green");

        //call fill method of Green
        color2.fill();

        //get an object of Color Blue
        ColorInterface color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        color3.fill();
    }

}
