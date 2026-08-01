package Weekly_Contest_469;

public class Minimum_Distance_Between_Three_Equal_Elements {
    public static void main(String[] args) {
    int []arr = {1,1,2,3,2,1,2};
        System.out.println(minimumDistance(arr));
    }
    public static int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        boolean hasTriplet = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        hasTriplet = true;
                        int sum = Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        if(ans>sum){
                            ans=sum;
                        }
                    }
                }
            }
        }
        return hasTriplet?ans:-1;
    }
}
