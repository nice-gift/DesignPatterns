package Factory.AbstractFactory;

import Factory.AbstractFactory.Ingredients.*;

public class NYIngredientFactory extends AbstractIngredientFactory {
    public NYIngredientFactory() {
        name = "NY style";
    }

    @Override
    public Cheese createCheese() {return new ReggianoCheese();}

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Clam createClam() {return new FreshClams();}
}
