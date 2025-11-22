package interview;

import java.util.List;
import java.util.Optional;

public class SecondHighestElement {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,7,8,32);

        // find the second-highest number from the list using single java 8 stream operation

        Optional<Integer> secondHighestNumber = list.stream()
                .distinct()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst();

        secondHighestNumber.ifPresentOrElse(
                num-> System.out.println("Second Highest: " + num),
                () -> System.out.println("The list doesn't have any second highest value")
        );
    }
}
