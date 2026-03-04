package string;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Solution {
    public static void main(String[] args) {
        String s1 = "navneet";
        String s2 = "thakur";

        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("s1: " + s1);
        System.out.println("s2: "+ s2);
    }
}


/**
 * Use Case of flatMap to sum the List<List<Integer>>
 *  public static void main(String[] args) {
 *         List<List<Integer>> list = new ArrayList<>();
 *         list.add(Arrays.asList(1,2,3));
 *         list.add(Arrays.asList(4,5,6));
 *         int sum = list.stream()
 *                 .flatMap(List::stream)
 *                 .mapToInt(Integer::intValue)
 *                 .sum();
 *
 *         System.out.println(sum);
 *
 *
 *     }
 */

/**
 * // PCSF - Predicate, Consumer, Supplier, Function
 *         // test accept get apply
 *         Predicate<Integer> isEven = x-> x % 2 == 0;
 *         System.out.println(isEven.test(4));
 *
 *         Consumer<String> hello = System.out::println;
 *         hello.accept("Consumer testing.");
 *
 *         Supplier<Double> random = Math::random;
 *         System.out.println((int)(random.get()*100));
 *
 *         Function<String, Integer> length = String::length;
 *         System.out.println(length.apply("Hello"));
 */
