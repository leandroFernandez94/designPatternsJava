package creacionales.AbstractFactory.Color;

/**
 * Created by leandro on 6/30/17.
 */
public class Red implements ColorInterface {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
