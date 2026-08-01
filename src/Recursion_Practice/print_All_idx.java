package Recursion_Practice;

public class print_All_idx {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int key = 2;
        print(arr,0,key);
    }
    public static void print(int[]arr,int idx,int key){
        if(idx== arr.length){
//            System.out.print(idx);
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        print(arr,idx+1,key);
    }
}
