package leetcode;

public class firstmissing {
    public static void main(String[] args) {
        int[]arr = {100000, 3, 4000, 2, 15, 1, 99999};
        System.out.println(firstMissingPositive(arr));
    }
    public static void sorting(int []arr){
        for(int i=1;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1] ;
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static int firstMissingPositive(int[] nums) {
        sorting(nums);
        int num  = 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==num){
                num++;
            }
        }
        return num;
    }
}
