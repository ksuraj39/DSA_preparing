package Binary_search;

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int []arr = {0,2,38,71,0,5,2,3,9,8,7,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int ans = 0,low=0,high=n-1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid+1]){
                ans = mid;
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
