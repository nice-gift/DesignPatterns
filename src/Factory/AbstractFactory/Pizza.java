package Factory.AbstractFactory;

import Factory.AbstractFactory.Ingredients.Dough;
import Factory.AbstractFactory.Ingredients.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println(showIngredients());
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");

    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String showIngredients() {
        return "Ingredients: dough = " + dough +
                ", sauce = " + sauce;
    }
}
