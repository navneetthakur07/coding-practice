package stream.misc;

import java.util.Arrays;
import java.util.List;

public class ArrayToDistinctSortedArray {

    public static void main(String[] args) {

        Integer[] arrays = {1,2,3,4,5,2,4,5,6,2,4,6,7};

        System.out.print("Non-sorted array: ");
        for(int i=0; i<arrays.length; i++) {
            System.out.print(arrays[i]);
        }
        System.out.println();
        List<Integer> list = Arrays.asList(arrays);

        List<Integer> updatedList =  list.stream()
                .sorted()
                .distinct()
                .toList();

        int[] output =  new int[updatedList.size()];

        for(int i=0; i<updatedList.size();i++){
            output[i] += updatedList.get(i);
        }

        System.out.print("Sorted array: ");
        for(int i=0; i<updatedList.size(); i++){
            System.out.print(output[i]);
        }
    }
}
