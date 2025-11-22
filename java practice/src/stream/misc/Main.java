package stream.misc;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> person = Arrays.asList(
                new Person("Manoj", 23),
                new Person("Akash", 54),
                new Person("Abhishek", 29)
        );

        // average age of the person
        double averageAge = person.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);

        System.out.println(averageAge);

    }
}
