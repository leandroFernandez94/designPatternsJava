package creacionales.Builder;

import creacionales.Builder.Drinks.Coke;
import creacionales.Builder.Drinks.Pepsi;
import creacionales.Builder.Food.ChickenBurger;
import creacionales.Builder.Food.VegBurger;

/**
 * Created by leandro on 7/1/17.
 */

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
