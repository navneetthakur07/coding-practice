package pattern_problem;

public class LeftHandPyramid {
    public static void main(String[] args) {
        int n = 4;
        printPatter(n);
    }

    public static void printPatter(int n) {
        for(int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


