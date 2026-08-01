package lecture_9;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,9,13,16,18,19,20,21};
        int item = 21;
        System.out.print(search(arr,item));
    }
    public static int search(int[] arr,int item){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==item){
                return mid;
            }else if (arr[mid]>item) {
                high = mid-1;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }
}
