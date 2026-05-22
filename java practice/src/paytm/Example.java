package paytm;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the user: ");
        int age = sc.nextInt();
        if(age <=18) {
            System.out.println("The user is minor. Access denied.");
        } else {
            System.out.println("The user can access the application.");
        }
    }
}
