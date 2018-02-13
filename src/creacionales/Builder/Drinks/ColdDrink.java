package creacionales.Builder.Drinks;

import creacionales.Builder.ItemInterface;
import creacionales.Builder.PackingInterface;

/**
 * Created by leandro on 7/1/17.
 */

public abstract class ColdDrink implements ItemInterface {

    @Override
    public PackingInterface packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

