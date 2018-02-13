package creacionales.Builder.Food;

import creacionales.Builder.Food.Burger;

/**
 * Created by leandro on 7/1/17.
 */

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
