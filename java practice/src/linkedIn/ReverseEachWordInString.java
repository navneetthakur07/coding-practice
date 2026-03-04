package linkedIn;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInString {

    public static void main(String[] args) {

        String word = "Material";

//        // First we will try to use the brute-force approach to solve the above problem
//        String reverseString = word.toLowerCase().chars()
//                .mapToObj(c-> (char)c)
//                .toString();
//
//        System.out.println(reverseString);

        String str = "Stream API is used to Process the data";

        System.out.println(str);

        String processedString = Arrays.stream(str.split(" "))
                .map(s-> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(processedString);

        // If there would be a single String why would we need to use the Stream
        // When we can solve the problem by using the StringBuilder only

        String newString = "Gautam";
        StringBuilder sb = new StringBuilder(newString);

        System.out.println(sb.reverse());
    }
}
