package Factory.FactoryMethod;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
