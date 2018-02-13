package creacionales.Builder.Food;

import creacionales.Builder.PackingInterface;

/**
 * Created by leandro on 7/1/17.
 */

public class Wrapper implements PackingInterface {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
