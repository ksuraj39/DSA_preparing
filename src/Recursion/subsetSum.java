package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class subsetSum {
    public static void main(String[] args) {
        int [] arr= {2,3};
        ArrayList<Integer> list = new ArrayList<>();
        subset(arr,0,0,list);
        Collections.sort(list);
        System.out.println(list);

    }
    public static void subset(int[]arr,int sum ,int idx,ArrayList<Integer> list){
        if(idx==arr.length){
            list.add(sum);
            return;
        }
        int num = arr[idx];
        subset(arr,sum + num,idx+1,list);
        subset(arr,sum,idx+1,list);
    }

}
