package interview;

import java.util.HashSet;
import java.util.Set;

import static interview.ArraySubsetProblem.isSubset;

public class ArraySubsetProblem {
    public static void main(String[] args) {

        int[] a = {2,4,5,11};
        int[] b = {4,5};

        int[] c = {1,2,3,4,5,6};
        int[] d = {1,2,4};

        int[] e = {10,5,2,23,19};
        int[] f = {19,5,3};

        // if both array are subset of one another

        Set<Integer> set1 = new HashSet<>();
        for(int num : a) {
            set1.add(num);
        }

        Set<Integer> set2= new HashSet<>();
        for(int num: c){
            set2.add(num);
        }

        Set<Integer> set3 =  new HashSet<>();
        for(int num: e){
            set3.add(num);
        }

        System.out.println(isSubset(b, set1));
        System.out.println(isSubset(d, set2));
        System.out.println(isSubset(f, set3));

    }

    public static boolean isSubset(int[] arr, Set<Integer> set) {
        for(int num : arr) {
            if(!set.contains(num)){
                return  false;
            }
        }
        return true;
    }
}
