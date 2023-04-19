package Factory.AbstractFactory;

import Factory.AbstractFactory.Ingredients.*;

public class ChicagoIngredientFactory extends AbstractIngredientFactory {
    public ChicagoIngredientFactory() {
        name = "Chicago style";
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Clam createClam() {return new FreshClams();}
}
