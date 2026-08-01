package leetcode;

public class Find_First_and_Last_Position {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(arr,target);
        for(int i =0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = firsttime(nums,target);
        int last  = lasttime(nums,target);
        return new int[]{first,last};
    }
    public static int firsttime(int[] arr,int val){
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==val){
                index = mid;
                high = mid-1;
            } else if (arr[mid]<val) {
                low = mid+1;
            }else {
                high= mid-1;
            }
        }
        return index;
    }
    public static int lasttime(int[] arr,int val){
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==val){
                index = mid;
                low = mid+1;
            } else if (arr[mid]<val) {
                low = mid+1;
            }else {
                high= mid-1;
            }
        }
        return index;
    }

}
