package design_pattern;

public class Singleton {

    private Singleton() {
        // to have a private constructor
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
