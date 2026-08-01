package Weekly_Contest_469;

public class Split_Array_With_Minimum_Difference {
    public static void main(String[] args) {
        int [] arr = {1,3,2};
        System.out.println(splitArray(arr));
    }
    public static long splitArray(int[] nums) {
        int n = nums.length;
        // prefix
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]+nums[i];
        }

        // IsInc
        boolean[] isInc = new boolean[n];
        isInc[0] = true;
        for(int i = 1;i<n;i++){
            if(nums[i]>nums[i-1]){
                isInc[i] = isInc[i-1];
            }else{
                isInc[i] = false;
            }
        }

        // isDes
        boolean[] isDec = new boolean[n];
        isDec[n-1] = true;
        for(int i = n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                isDec[i] = isDec[i+1];
            }else{
                isDec[i] = false;
            }
        }
        long minDiff = Long.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < n-1; i++) {
            if(isInc[i] && isDec[i+1]){
                found = true;
                long leftSum = prefix[i];
                long rightSum = prefix[n-1]-prefix[i];
                minDiff = Math.min(minDiff,Math.abs(leftSum-rightSum));
            }
        }
        return found?minDiff:-1;
    }
}
