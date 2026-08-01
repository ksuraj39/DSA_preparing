package Sliding_window;

public class All_SubArray_sum {
    public static void main(String[] args) {
        int[]arr = {3,4,6,7};
        int n = arr.length;

        // frr * ai

        for(int i = 0;i < arr.length;i++){
            arr[i] = (i+1)*(n-1) * arr[i];
        }

        // sum = 0
        int sum = 0;
        for(int num : arr){
            sum+= num;
        }
        System.out.println(sum);
    }
}
