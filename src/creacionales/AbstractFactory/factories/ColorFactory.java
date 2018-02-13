package creacionales.AbstractFactory.factories;

import creacionales.AbstractFactory.Color.Blue;
import creacionales.AbstractFactory.Color.ColorInterface;
import creacionales.AbstractFactory.Color.Red;
import creacionales.AbstractFactory.Shape.ShapeInterface;
import creacionales.AbstractFactory.Color.Green;

/**
 * Created by leandro on 6/30/17.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public ShapeInterface getShape(String shapeType){
        return null;
    }

    @Override
    public ColorInterface getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
