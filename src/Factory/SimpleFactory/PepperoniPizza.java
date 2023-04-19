package Factory.SimpleFactory;

import java.util.ArrayList;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "PepperoniPizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings = new ArrayList<>();

        toppings.add("Grated Reggiano CheesePizza");
    }
}