package Array_leetcode;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(Kth_largeNum(arr,k));
    }
    public static int Kth_largeNum(int[]nums,int k){
        int pivot = -1;
        int n = nums.length;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        // not find pivot
        if(pivot==-1){
            swap(nums,0,n-1);
        }

        // pivot more than number
        for (int i = n-1; i >pivot ; i--) {
            if(nums[pivot]<nums[i]){
                swap(nums,pivot,i);
                break;
            }
        }

        // swap all
        swap(nums,pivot,n-1);
        return nums[n-k];
    }
    public static void swap(int []arr,int left, int right){
        while (left<=right){
            int tem = arr[left];
            arr[left] = arr[right];
            arr[right] = tem;
            left++;
            right--;
        }
    }
}
