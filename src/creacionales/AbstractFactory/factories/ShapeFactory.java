package creacionales.AbstractFactory.factories;

import creacionales.AbstractFactory.Color.ColorInterface;
import creacionales.AbstractFactory.Shape.Circle;
import creacionales.AbstractFactory.Shape.Rectangle;
import creacionales.AbstractFactory.Shape.ShapeInterface;
import creacionales.AbstractFactory.Shape.Square;

/**
 * Created by leandro on 6/30/17.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public ShapeInterface getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    public ColorInterface getColor(String color) {
        return null;
    }
}