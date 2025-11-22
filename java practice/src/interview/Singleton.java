package interview;

public class Singleton {

    private Singleton() {
        // private Constructor so no other class can create object
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if(instance==null) {
            synchronized (Singleton.class) {
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
