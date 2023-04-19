package Factory.SimpleFactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("Pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("CheesePizza")) {
            return new CheesePizza();
        } else return null;
    }
}
