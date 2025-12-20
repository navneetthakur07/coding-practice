package stream.easy;

import java.util.Arrays;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,4,6,7,11,24,46,23);
        List<Integer> sortedList = numbers.stream()
                .sorted().toList();
        System.out.println(sortedList);

    }
}
