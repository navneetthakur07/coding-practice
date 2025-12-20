package stream.easy;

import java.util.*;

public class Question7 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,4,6,7,9,24,46,23);
        // Find first element greater than 10 in the numbers list
        Optional<Integer> numGrtrDenTen = numbers.stream()
                .filter(n->n>10).findFirst();


    }
}
