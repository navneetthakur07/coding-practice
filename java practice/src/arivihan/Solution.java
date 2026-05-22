package arivihan;

class Solution {
    public int minOperations(int[] arr) {
        int ans =0;
        if(arr.length==1)return 0;


        for(int i =1 ;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                int dif = arr[i-1]-arr[i] +1;
                arr[i]=arr[i-1]+1;
                ans+=dif;
            }

        }

        return ans;
    }
}
