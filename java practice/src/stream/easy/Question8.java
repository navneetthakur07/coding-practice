package stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question8 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,4,6,7,11,24,46,23);
        List<Integer> squareNumbers = numbers.stream()
                .map(num-> num*num)
                .toList();

        System.out.println(squareNumbers);
    }
}
