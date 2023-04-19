package Factory.AbstractFactory;

import Factory.AbstractFactory.Ingredients.Cheese;
import Factory.AbstractFactory.Ingredients.Clam;
import Factory.AbstractFactory.Ingredients.Dough;
import Factory.AbstractFactory.Ingredients.Sauce;

public abstract class AbstractIngredientFactory {
    public String name;

    abstract Cheese createCheese();
    abstract Dough createDough();
    abstract Sauce createSauce();
    abstract Clam createClam();
}
