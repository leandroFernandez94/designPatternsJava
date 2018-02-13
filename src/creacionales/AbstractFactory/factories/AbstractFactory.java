package creacionales.AbstractFactory.factories;

import creacionales.AbstractFactory.Color.ColorInterface;
import creacionales.AbstractFactory.Shape.ShapeInterface;

/**
 * Created by leandro on 6/30/17.
 */
public abstract class AbstractFactory {
    public abstract ColorInterface getColor(String color);
    public abstract ShapeInterface getShape(String shape);
}
