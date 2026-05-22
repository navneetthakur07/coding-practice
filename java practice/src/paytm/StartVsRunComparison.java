package paytm;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running: " + currentThread().getName());
    }
}
public class StartVsRunComparison {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println("Calling run() on both the threads: ");
        t1.run();
        t2.run();

        System.out.println("Calling start() on both the thread: ");
        t1.start();
        t2.start();

    }
}
