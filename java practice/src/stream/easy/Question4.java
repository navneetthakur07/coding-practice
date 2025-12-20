package stream.easy;

import java.util.Arrays;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pawn", "Navneet",
                "Fugal", "Prakash", "Akash", "Atsushi");

        long countString = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println(countString);
    }
}
