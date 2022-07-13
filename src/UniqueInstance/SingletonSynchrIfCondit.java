package UniqueInstance;

public class SingletonSynchrIfCondit {
    private volatile static SingletonSynchrIfCondit uniqueInstance;

    private String name;

    private SingletonSynchrIfCondit() {
    }

    private SingletonSynchrIfCondit(String name) {
        this.name = name;
    }

    public static SingletonSynchrIfCondit getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonSynchrIfCondit.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonSynchrIfCondit("Java is great!");
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return name;
    }
}
