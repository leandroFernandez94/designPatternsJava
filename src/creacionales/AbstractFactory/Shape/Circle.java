package creacionales.AbstractFactory.Shape;

/**
 * Created by leandro on 6/30/17.
 */

public class Circle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
