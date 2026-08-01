package lecture_9;

public class Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,455,62,3,2,3,0,1,2};
        int target = 0;
        System.out.println(Rotated(arr,target));
    }
    public static int Rotated(int[] arr,int target){
        int low  = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[low]<=arr[mid]) { // uppeer line
                if(arr[low]<=target && arr[mid]>target){
                    high = mid -1;
                }else{
                    low =mid+1;
                }
            }
            else {
                if(arr[high]>=target && arr[mid]<target){
                    low = mid +1;
                }else{
                    high =mid -1;
                }
            }

        }
        return -1;
    }
}
