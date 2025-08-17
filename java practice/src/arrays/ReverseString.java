package arrays;

import java.util.Arrays;

/*
This is blind question that I am solving, I will not use the method
that I know to reverse the String.
 */
public class ReverseString {
    public static void main(String[] args) {
        String string = "Material";
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        char[] chars = string.toCharArray();
        for (int i=0, j = chars.length-1; i< j;  i++, j--){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return Arrays.toString(chars);
    }
}

/*
Rough work:
    str = "KAJAL"; -> 0
    reverseString = "LAKAK" -> n-1
    the condition which plays an important role is
    i should not overlap j..
    */