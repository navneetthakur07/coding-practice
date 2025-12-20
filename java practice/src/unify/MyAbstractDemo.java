package unify;

public class MyAbstractDemo {
    public MyAbstractDemo() {
        System.out.println("MyAbstract Demo method result");
    }
}

class AbstractDemo extends MyAbstractDemo {
    public AbstractDemo() {
        System.out.println("Abstract Demo method result");
    }

    public static void main(String[] args) {
        AbstractDemo obj = new AbstractDemo();
    }
}
