package Weekly_Contest_469;

public class Minimum_Distance_Between_Three_Equal_Element_II {
    public static void main(String[] args) {
        int []arr = {1,2,1,1,3};
        System.out.println(minimumDistance(arr));
    }
    public static int minimumDistance(int[] nums) {
        int n = nums.length;
        int minDis = Integer.MAX_VALUE;
        boolean hasTriplet = false;

        for(int i=0;i<n;i++){
            int left = i+1,right=n-1;
            while(left<right){
                if(nums[i]==nums[left] && nums[left]==nums[right]){
                    hasTriplet = true;
                    int sum = 2*(Math.max(Math.max(right,left),i)-Math.min(Math.min(left,right),i));
                    if(minDis>sum){
                        minDis=sum;
                    }
                    right--;
                } else if (nums[left]!=nums[i]) {
                    left++;
                } else if (nums[left]!=nums[right]) {
                    right--;
                }
            }
        }
        return hasTriplet?minDis:-1;
    }
}
