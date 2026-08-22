package accenture;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(8);
    }

    private static void fibonacci(int n) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Number by term: " + n);

        for(int i=0; i<n; i++) {
            System.out.print(first + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}
