package leetcode;

public class H_Index_II {
    public static void main(String[] args) {
        int[] arr = {1,2,100};
        System.out.println(hIndex(arr));
    }
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0, high = n-1;
        while (low<high){
            int mid = (low+high)/2;
            if(citations[mid]==n-mid){
                return citations[mid];
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}


