package leetcode;

public class Maximum_Count {
    public static int max_count(int[]nums){
        int ans = 0;
        int i =0,j = nums.length-1;
        int neg = 0,pos = 0;
        while(i<=j){
            if(nums[i]<0){
                neg++;
                i++;
            } else if (nums[i]==0) {
                i++;
            }
            if(nums[j]>0) {
                pos++;
                j--;
            } else if (nums[j]==0) {
                j--;
            }
        }
        ans = Math.max(neg,pos);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2};
        System.out.println(max_count(arr));

    }
}
