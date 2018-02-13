package creacionales.AbstractFactory.Color;

/**
 * Created by leandro on 6/30/17.
 */
public class Blue implements ColorInterface {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
