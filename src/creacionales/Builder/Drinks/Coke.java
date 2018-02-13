package creacionales.Builder.Drinks;

import creacionales.Builder.Drinks.ColdDrink;

/**
 * Created by leandro on 7/1/17.
 */

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
