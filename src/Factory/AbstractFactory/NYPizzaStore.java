package Factory.AbstractFactory;

public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore() {
        factory = new NYIngredientFactory();}
}
