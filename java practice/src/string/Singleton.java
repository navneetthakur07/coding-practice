package string;

public class Singleton {
    // single object reference
   // In modern Java (JDK 1.5+), this works fine because of Java Memory Model improvements (volatile semantics).
    private static volatile Singleton instance;

    private Singleton() {
        // private constructor to prevent object creation from outside
    }

    public static Singleton getInstance() {
        if(instance==null){ // 1st check without lock
            synchronized (Singleton.class){ // lock only when needed
                if(instance==null){ // 2nd check (with lock)
                    instance = new Singleton(); // creation of object
                }
            }
        }
        return instance;
    }
}
