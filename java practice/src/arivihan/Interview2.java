package arivihan;

import java.util.HashMap;

public class Interview2 {

    public static void main(String[] args) {
        int[] array = {1,1,1};
        int[] array2 = {3,1,5,4};

        // function - no of operation is incrementing by 1 is called an operation.
        // we want in minimum operation sorted array

        int count = 0;

        for(int i=0; i<array2.length; i++) {
            if(array2[i]>array2[i+1]) {
                int maxValue = array2[i+1];
                while(maxValue>array2[i]){
                    maxValue = maxValue + 1;
                    count++;
                }
            } else  {
                continue;
            }
            System.out.println(count);
        }




    }
}
