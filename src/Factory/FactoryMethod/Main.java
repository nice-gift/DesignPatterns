package Factory.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore store1=new ChicagoPizzaStore();
        PizzaStore store2=new NYPizzaStore();
        store1.orderPizza("cheese");
        System.out.println("-----------------");
        store2.orderPizza("cheese");
    }
}
