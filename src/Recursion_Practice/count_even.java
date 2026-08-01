package Recursion_Practice;

public class count_even {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,6};
        System.out.println(count(arr,0,0));
    }
    public static int count(int[]arr,int even,int idx){
        if(idx== arr.length){
            return even;
        }
        if(arr[idx]%2==0){
            even++;
        }
        return count(arr,even,idx+1);
    }
}
