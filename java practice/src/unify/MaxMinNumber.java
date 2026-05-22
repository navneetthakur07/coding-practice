package unify;

public class MaxMinNumber {

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE; // we have taken one of the largest integer value as min
        int max = Integer.MIN_VALUE; // we have taken one of the smallest integer value as max

        int[] array = {57, 23,47,56,74,89}; // This is the array, we have to write a logic to find the largest and smallest number
        for(int arr : array) {
            if(arr<min) {
                min = arr;
            }
        }
        for(int arr: array) {
            if(arr>max) {
                max = arr;
            }
        }
        System.out.println("Minimum value is : " + min);
        System.out.println("Maximum value is : " + max);
    }
}
