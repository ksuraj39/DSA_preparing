package leetcode;

import java.util.Scanner;

public class Binary_Search {
    public static int Search(int[]nums,int target){
        int i =0,j= nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int tar = 9;
        System.out.println(Search(arr,tar));
    }
}
