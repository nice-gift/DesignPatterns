package Factory.AbstractFactory;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {
        factory = new ChicagoIngredientFactory();
    }
}
