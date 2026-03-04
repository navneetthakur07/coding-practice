package java_grokking;

public class Child implements Interface1, Interface2 {

    @Override
    public void hello() {
        System.out.println("Inside child class hello method");
        Interface1.super.hello();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.hello();
    }
}

interface Interface1 {
    default void hello() {
        System.out.println("Inside Interface 1");
    }
}

interface Interface2 {
    default void hello() {
        System.out.println("Inside Interface 2");
    }
}
