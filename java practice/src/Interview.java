import java.util.*;

public class Interview {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,5,20,8);
        int[] array = {10,5,20,8};
//
//        Integer secondLargestNumber = list.stream()
//                .sorted((a,b) -> b.compareTo(a))
//                        .skip(1)
//                                .findFirst()
//                                        .get();
        List<Integer> numbers = new ArrayList<>();
        for (int arr: array) {
            numbers.add(arr);
        }

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
        List<Integer> reversedList = numbers.reversed();
        System.out.println("Reversed List: " + reversedList);
        System.out.println(reversedList.get(1));
    }
}
