package leetcode;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        move(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void move(int[] nums){
        int zeroes = 0;
        for (int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                nums[zeroes] = nums[i];
                zeroes++;
            }
        }
        while (zeroes< nums.length){
            nums[zeroes++] = 0;
        }
    }
}
