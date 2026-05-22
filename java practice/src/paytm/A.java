package paytm;

public class A{
    private A() {}
    private static class Holder {
        private static final A INSTANCE = new A();
    }
    public static A getInstance() {
        return Holder.INSTANCE;
    }
}