package stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pawn", "Navneet", "Fugal", "Prakash");
        names.stream()
                .forEach(System.out::println);

    }
}
