package Binary_search;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = -1;
        for(int nu : nums){
            high = Math.max(nu,high);
        }
        int ans = high;
        while(low < high){
            int mid = low + (high - low)/2;

            if(isPossible(nums,mid,threshold)){
                ans = mid;
                high = mid ;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int []nums,int division,int threshold){
        int sum = 0;
        for(int num :nums){
            sum += (int) Math.ceil((double) num/division);
//            if(num % division == 0){
//                sum += num/division;
//            }else{
//                sum += num/division + 1;
//            }

            if(sum > threshold) return false;
        }
        return true;
    }
}
