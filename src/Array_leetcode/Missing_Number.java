package Array_leetcode;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = { 1,2,0,4};
        System.out.println(missing1(arr));   // brute force
        System.out.println(missing2(arr));   // better approach
        System.out.println(missing3(arr));   // optimal approach 1
        System.out.println(missing4(arr));   //  with xor

    }
    // Optimal Approach 2 - XOR
    // tc -- 0(n)
    // sc -- 0(1) and avoid integer overflow
    public static int missing4(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ i;
        }

        xor1 ^= nums.length;

        return  xor1 ^ xor2;
    }

    // optimal approach   sum formula
    public static int missing3(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int sum1 = (n*(n+1))/2;
        for(int i = 0; i<n;i++){
            sum+=nums[i];
        }
        return sum1-sum;
    }


    // better approach
    // tc -- 0(n) + 0(n) -- 0(2N)
    // sc -- 0(N)

    public static int missing2(int[] nums) {
        int n = nums.length;
        int hash[] = new int[n+1];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]] = 1;
        }

        for (int i = 0; i <= n; i++) {
            if(hash[i] == 0) return i;
        }
        return -1;

    }



    // brute force approach
    // tc --- 0(n * n)
    // sc --- 0(1)
    public static int missing1(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            int flag = -1;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == i){
                    flag = i;
                    break;
                }
            }
            if(flag == -1){
                return i;
            }
        }
        return 0;
    }

}
