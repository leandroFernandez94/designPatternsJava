package creacionales.AbstractFactory.Color;

/**
 * Created by leandro on 6/30/17.
 */
public class Green implements ColorInterface {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
