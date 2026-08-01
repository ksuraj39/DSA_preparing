package Recursion;

public class firstArrange {
    public static void main(String[] args) {
        int [] arr = {3,2,4,2,4,2};
        int item = 4;
        System.out.println(find(arr,item,0));
    }
    public static int find(int[]arr,int ele,int idx){
        if(arr.length==idx)return -1;

        if(arr[idx] == ele){
            return idx;
        }
        return find(arr,ele,idx+1);
    }
}
