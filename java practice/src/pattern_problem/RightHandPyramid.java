package pattern_problem;

public class RightHandPyramid {
    public static void main(String[] args) {
        int n = 4;
        printPatter(n);
    }
    public static void printPatter(int n) {
        for (int i =0; i<=n; i++) {
            int spaces = n-i;
            // for printing spaces
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            // for printing *
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
