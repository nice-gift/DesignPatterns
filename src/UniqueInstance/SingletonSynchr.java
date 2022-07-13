package UniqueInstance;

public class SingletonSynchr {
    private static SingletonSynchr uniqueInstance;

    private String name;

    private SingletonSynchr() {
    }

    private SingletonSynchr(String name) {
        this.name = name;
    }

    public static synchronized SingletonSynchr getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchr("Java is great!");
        }
        return uniqueInstance;
    }

    @Override
    public String toString(){
        return name;
    }
}
