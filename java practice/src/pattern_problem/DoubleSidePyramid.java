
package pattern_problem;

public class DoubleSidePyramid {
    public static void main(String[] args) {
        int n = 10;
        printPattern(n);
    }

    public static void printPattern(int n) {
        // most complex problem of pattern, but we will solve in easy pattern

        // Upper pyramid
        for (int i=1; i<=n; i++) { // for row
            // left half pyramid
            for(int j=1; j<=i; j++) { // for column
                System.out.print("*");
            }
            // for spaces
            int spaces = 2*(n-i);
            for (int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }

            // for right half pyramid
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower pyramid

        for(int i=n; i>=1; i--){
            // for left hand pyramid
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            // for spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // for right hand pyramid
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
