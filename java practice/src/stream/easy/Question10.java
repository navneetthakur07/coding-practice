package stream.easy;

import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pawn", "Navneet", "Fugal",
                "Prakash", "Akash", "Atsushi");
        names.stream().forEach(System.out::println);
    }
}
