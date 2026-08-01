package assignment_4;

import java.util.Scanner;

public class Painters_Partition_Problem {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int nop = sc.nextInt(); // number of painter
        int n = sc.nextInt();
        int [] boards = new int[n];

        for (int i = 0; i < boards.length; i++) {
            boards[i] = sc.nextInt();
        }
        System.out.println(minimumMaxtime(boards,nop));
    }

    public static long minimumMaxtime(int [] arr,int p){
        long low = 0;
        long high = 0;
        for (int ele:arr) {
            low = Math.max(ele,low);
            high+=ele;
        }

        long ans = high;
        while (low<=high){
            long mid = low+(high-low)/2;
            if(isPossible(p,arr,mid)){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int pain,int [] arr,long maxUnit){
        int painters = 1;
        int totalUnit = 0;
        for(int ele:arr){
            if(ele>maxUnit) return false;
            totalUnit += ele;
            if(totalUnit>maxUnit){
                painters++;
                totalUnit = ele;
            }
        }
        return painters <= pain;
    }
}
