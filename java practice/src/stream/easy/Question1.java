package stream.easy;

import java.util.Arrays;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1,2,4,6,8,76,4,7,3,5,4,9,12);

        List<Integer> evenNumbers = listOfInteger.stream()
                .filter(num -> num%2==0)
                .distinct()
                .sorted()
                .toList();

        System.out.println("Even numbers filtered out from the list are: " + evenNumbers);
    }
}
