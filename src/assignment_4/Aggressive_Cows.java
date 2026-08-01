package assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int nos = sc.nextInt();           // no of stall
            int cows = sc.nextInt();        // no of cows
            int[] stall_pos = new int[nos];
            for (int i = 0; i < stall_pos.length; i++) {
                stall_pos[i] = sc.nextInt();
            }
            Arrays.sort(stall_pos);
            System.out.println(Largest_minimum_distance(stall_pos, cows));
        }
    }
    public static int Largest_minimum_distance(int[] stall,int cows ){
        int n = stall.length;
        int low = 0;
        int high = stall[n-1]-stall[0];
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(stall,cows,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[]arr,int cows,int mid){
        int cow = 1;
        int pos = arr[0];   // first of stall

        for(int i =1;i< arr.length;i++){
            if(arr[i]-pos>=mid){
                cow++;
                pos = arr[i];
            }
            if(cow==cows){
                return true;
            }
        }
        return false;
    }
}
