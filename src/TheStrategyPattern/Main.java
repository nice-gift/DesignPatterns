package TheStrategyPattern;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }
}
