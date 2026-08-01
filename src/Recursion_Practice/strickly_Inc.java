package Recursion_Practice;

public class strickly_Inc {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4};
        System.out.println(isIncrese(arr,0));
    }
    public static boolean isIncrese(int[]arr ,int i){
        if(i == arr.length-1) return true;
        if(arr[i]+1 !=arr[i+1]) return false;
        return isIncrese(arr,i+1);
    }
}
