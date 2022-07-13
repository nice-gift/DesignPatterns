package UniqueInstance;

public class Main {
    public static void main(String[] args) {
        SingletonSynchr singleton = SingletonSynchr.getInstance();
        System.out.println(singleton);
    }
}
