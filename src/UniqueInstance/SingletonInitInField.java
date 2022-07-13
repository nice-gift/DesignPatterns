package UniqueInstance;

public class SingletonInitInField {
    private static SingletonInitInField uniqueInstance =
            new SingletonInitInField("Java is great!");

    private String name;

    private SingletonInitInField() {
    }

    private SingletonInitInField(String name) {
        this.name = name;
    }

    public static SingletonInitInField getInstance() {
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return name;
    }
}

