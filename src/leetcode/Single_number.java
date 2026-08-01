package leetcode;

public class Single_number {
    public static int Single(int[]nums){
        int ans =0;
        for(int i=0;i< nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(Single(arr));
    }
}
