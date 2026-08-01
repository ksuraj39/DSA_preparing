package leetcode;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1,5,4};
        thirdMax(arr);
    }
    public static void thirdMax(int[] nums) {
        sorting(nums);
        for (int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void sorting(int[] arr){
        for(int i =1;i< arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]<arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}



