package Factory.AbstractFactory;

import Factory.AbstractFactory.Ingredients.Clam;

public class ClamPizza extends Pizza {
    AbstractIngredientFactory factory;
    Clam clam;

    public ClamPizza(AbstractIngredientFactory factory) {
        this.factory = factory;
        name = "Clam pizza in " + factory.name;
        dough = factory.createDough();
        sauce = factory.createSauce();
        clam = factory.createClam();
    }

    @Override
    public String showIngredients() {
        return super.showIngredients()+", clam = "+clam;
    }
}
