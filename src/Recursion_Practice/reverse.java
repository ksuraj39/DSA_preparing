package Recursion_Practice;

public class reverse {
    public static void main(String[] args) {
        int[] arr = { 3,4,5,6,1};
        rev(arr,0);
    }
    public static void rev(int[]arr,int i){
        if(i== arr.length) return;
        rev(arr,i+1);
        System.out.print(arr[i]+" ");
    }
}
