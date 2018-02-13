package creacionales.Prototype;

/**
 * Created by leandro on 7/1/17.
 */

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
