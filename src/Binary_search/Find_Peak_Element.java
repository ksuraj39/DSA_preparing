package Binary_search;

public class Find_Peak_Element {
    public static int Peak_Element(int[]nums){
        if(nums.length<=1) return 0;
        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int mid = low+(high-low)/2;
            if (nums[mid]<nums[mid+1]){
                low = mid +1;
            }else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int [] arr = {2,1};
        System.out.println(Peak_Element(arr));
    }
}
