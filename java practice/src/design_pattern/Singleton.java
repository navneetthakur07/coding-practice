package design_pattern;

public class Singleton {

    private Singleton() {
        // to have a private constructor
    }

    // to assign a volatile static variable
    private static volatile Singleton instance;

    // getter method to return the class type data
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
