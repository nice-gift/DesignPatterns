package TemplateMethod;

public abstract class AbstractBeverage {
    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();

    abstract void addCondiments();

    boolean customerWantsCondiments() {
        return true;
    }
}
