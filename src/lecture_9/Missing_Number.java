package lecture_9;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int sum1 = (n*(n+1))/2;
        for(int i = 0; i<n;i++){
            sum+=nums[i];
        }
        return sum1-sum;
    }
}
