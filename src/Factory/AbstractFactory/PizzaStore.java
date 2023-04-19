package Factory.AbstractFactory;

public abstract class PizzaStore {
    AbstractIngredientFactory factory;

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new CheesePizza(factory);
        } else if (type.equals("clam")) {
            return new ClamPizza(factory);
        }
        return null;
    }
}
