package linkedIn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighestNumberInAList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> arrayList = new ArrayList<>(numbers);
//        Integer secondHighest = numbers.stream()
//                .sorted((a,b)-> b.compareTo(a))
//                .skip(1)
//                .findFirst()
//                .get();
//
//        System.out.println(secondHighest);
        Collections.reverse(arrayList);
        System.out.println(arrayList.get(1));

    }
}
