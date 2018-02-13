package creacionales.Builder.Food;

import creacionales.Builder.Food.Burger;

/**
 * Created by leandro on 7/1/17.
 */

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
