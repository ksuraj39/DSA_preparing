package Binary_search;

public class Search_in_Rotated_Sorted_Array_II {
    public static boolean Search_in_Rotated(int[] nums ,int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] == nums[low]) {
                low++;
            } else if (nums[mid] == nums[high]) {
                high--;
            } else if (nums[mid] < nums[high]) {
                if (nums[mid] < target && nums[high] >= target) low = mid + 1;
                else high = mid - 1;
            } else {
                if (nums[mid] < target && nums[low] >= target) high = mid - 1;
                else low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,2};
        int tar = 2;
        System.out.println(Search_in_Rotated(arr,tar));
    }
}
