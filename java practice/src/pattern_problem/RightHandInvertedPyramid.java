package pattern_problem;

import java.util.Scanner;

/*
         *
        **
       ***
      ****
     *****
*/
public class RightHandInvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the pyramid : ");
        int num = 5;
        for(int i=1; i<=num; i++){
            for(int j=1; j<num-i;j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
