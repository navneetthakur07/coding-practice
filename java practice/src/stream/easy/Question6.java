package stream.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,4,6,7,11,24,46,23);
        // using comparator
        Optional<Integer> maxNumber = numbers.stream()
                .max(Comparator.naturalOrder());
//                .sorted((a,b)->b-a)
//                .findFirst();

        maxNumber.ifPresentOrElse(
                (num)->System.out.println("Max number is: "+ num),
                ()-> System.out.println("No maximum number found")
        );

        // using max function
        Optional<Integer> maxNumberFound = numbers.stream()
                .max(Integer::compareTo);
        System.out.println(maxNumberFound);
    }
}
