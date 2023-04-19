package Factory.SimpleFactory;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Chicago Style Deep Dish CheesePizza Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella CheesePizza");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
