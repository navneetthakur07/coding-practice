package stream.misc;

import java.util.Arrays;
import java.util.List;

public class CountNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-1);

        List<Integer> evenNumbers = numbers.stream()
                .filter(p-> p%2==0)
                .toList();

        Long countOfNumbers = numbers.stream()
                        .count();

        System.out.println(evenNumbers);
        System.out.println(countOfNumbers);
    }
}
