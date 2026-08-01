package Array_leetcode;

public class Jump_Game {
    public static void main(String[] args) {
        int[]arr = {1};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int [] nums){
        int n = nums.length;
        if(n==1) return true;
        int last = n-1;

        for (int i = 1; i < n-1;i++) {
            int sum = i+nums[i];
            if(sum==last){
                return true;
            }
        }
        return false;
    }
}
