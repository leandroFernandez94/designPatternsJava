package creacionales.Prototype;

/**
 * Created by leandro on 7/1/17.
 */

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
