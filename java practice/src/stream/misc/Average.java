package stream.misc;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,11,24,23,71,15,19);
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(average);
    }
}
