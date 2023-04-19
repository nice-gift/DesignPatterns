package Factory.AbstractFactory;

import Factory.AbstractFactory.Ingredients.Cheese;

public class CheesePizza extends Pizza {
    AbstractIngredientFactory factory;
    Cheese cheese;

    public CheesePizza(AbstractIngredientFactory factory) {
        this.factory = factory;
        name = "Cheese pizza in " + factory.name;
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }

    @Override
    public String showIngredients() {
        return super.showIngredients()+", cheese = "+cheese;
    }
}
