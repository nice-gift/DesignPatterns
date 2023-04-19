package Factory.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore store=new ChicagoPizzaStore();
        store.orderPizza("cheese");
        System.out.println("----------------");
        store.orderPizza("clam");
        System.out.println("----------------");
        PizzaStore store2=new NYPizzaStore();
        store2.orderPizza("cheese");
    }
}
