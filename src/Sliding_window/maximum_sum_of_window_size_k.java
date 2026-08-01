package Sliding_window;

public class maximum_sum_of_window_size_k {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,1,2,3,4};
        int k = 3;
        System.out.println(Maximum_Sum(arr,k));
    }
    public static int Maximum_Sum(int []arr, int k){
        int ans = 0,sum = 0;
        // 1st window ka answer
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        ans = sum;

        for (int i = k; i < arr.length ; i++) {
            sum+=arr[i];    // window grow
            sum = sum-arr[i-k];  // window shink
            ans = Math.max(ans,sum);   // answer
        }
        return ans;
    }
}
