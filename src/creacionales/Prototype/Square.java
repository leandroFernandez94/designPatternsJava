package creacionales.Prototype;

/**
 * Created by leandro on 7/1/17.
 */

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}