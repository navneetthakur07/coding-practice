package stream.medium;

import java.util.Arrays;
import java.util.List;

/*
Program to find the numbers that starts with 1 using Streams
 */
public class Question1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,11,24,23,71,15,19);
        List<String> numbersStartWithOne = numbers.stream()
                .map(num -> num.toString())
                .filter(str -> str.startsWith("1"))
                .toList();

        System.out.println("Raw Data: " + numbers);
        System.out.println("Filtered Date: " + numbersStartWithOne);
    }
}
