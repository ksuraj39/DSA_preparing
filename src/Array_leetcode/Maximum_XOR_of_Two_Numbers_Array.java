package Array_leetcode;

public class Maximum_XOR_of_Two_Numbers_Array {
    public static void main(String[] args) {
        int []arr = {8,2,10};
        System.out.println(MaximumXOR(arr));
    }
    public static int MaximumXOR(int[] arr){
        int ans = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length ; i++) {
            int val = arr[i]^arr[i-1];
            if(val>ans){
                ans = val;
            }
        }
        return ans;
    }
}
