package string;

import java.util.*;
import java.lang.*;

public class PasswordChecker {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to password checker program.");
        String password;
        do {

            System.out.println("Enter the password to login into portal");
            password = sc.next();
            if (isCorrectPassword(password)) {
                System.out.println("Wrong password, try again!!");
            } else {
                System.out.println("You have successfully entered the correct Password");
            }

        } while (isCorrectPassword(password));

    }

    public static boolean isCorrectPassword (String password) {
        String correctPassword = "CoderNavneet";
        return !password.equals(correctPassword);
    }
}
