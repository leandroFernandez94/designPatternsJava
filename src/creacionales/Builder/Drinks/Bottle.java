package creacionales.Builder.Drinks;

import creacionales.Builder.PackingInterface;

/**
 * Created by leandro on 7/1/17.
 */

public class Bottle implements PackingInterface {

    @Override
    public String pack() {
        return "Bottle";
    }
}
