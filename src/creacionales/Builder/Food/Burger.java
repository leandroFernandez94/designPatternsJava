package creacionales.Builder.Food;

import creacionales.Builder.ItemInterface;
import creacionales.Builder.PackingInterface;

/**
 * Created by leandro on 7/1/17.
 */


public abstract class Burger implements ItemInterface {

    @Override
    public PackingInterface packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}