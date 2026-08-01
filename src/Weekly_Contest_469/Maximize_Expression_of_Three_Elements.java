package Weekly_Contest_469;

public class Maximize_Expression_of_Three_Elements {
    public static void main(String[] args) {
        int []nums = {-8,-8,-8};
        System.out.println(maximizeExpressionOfThree(nums));
    }
    public static int maximizeExpressionOfThree(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = a;
        int c = Integer.MAX_VALUE;
        int ans =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>a){
                b = a;
                a = nums[i];
            } else if (nums[i]<=a && nums[i]>b) {
                b = nums[i];
            }
            if(nums[i]<c){
                c = nums[i];
            }
            int max = a+b-c;
            ans = Math.max(ans,max);
        }
        return ans;
    }
}
