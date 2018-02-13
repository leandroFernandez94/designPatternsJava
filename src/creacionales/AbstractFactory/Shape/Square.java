package creacionales.AbstractFactory.Shape;

/**
 * Created by leandro on 6/30/17.
 */

public class Square implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
