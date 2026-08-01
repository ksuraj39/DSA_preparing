package Binary_search;

public class two_sum_of_array {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        int val = -1;
        int[] result = add(arr,val);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers sum up to the target.");
        }
    }
    public static int[] add(int[] numbers, int target) {
        int [] temp = new int[2];
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int x = numbers[i];
            int low = i+1,high=n-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(numbers[mid]+x > target){
                    high = mid -1;
                } else if (numbers[mid]+x < target) {
                    low = mid+1;
                }else{
                    temp[0] = i+1;
                    temp[1] = mid+1;
                    break;
                }
            }
        }
        return temp;
    }
}
