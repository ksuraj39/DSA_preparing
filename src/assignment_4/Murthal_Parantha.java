package assignment_4;

import java.util.Scanner;

public class Murthal_Parantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();   // number of order parathas
        int l = sc.nextInt();
        int []rank = new int[l];
        for (int i = 0; i < l; i++) {
            rank[i] = sc.nextInt();
        }
        System.out.println(maxTime(p,rank));
    }
    public static int  maxTime(int p ,int[] rank){
        int maxRank = 0;
        for(int ele:rank) maxRank = Math.max(maxRank,ele);

        // advance bianry
        int low = 0;
        int high = maxRank*p*(p+1)/2;
        int ans = high;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossibleTime(p,rank,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossibleTime(int p,int [] rank,int time){
        int totalP = 0;     // how will be make paratha in minutes

        for(int ele:rank){
            int k = 1;
            int curTime = 0;
            while(curTime+k*ele <=time){
                curTime += k*ele;
                k++;
                totalP++;
                if(totalP>=p){
                    return true;
                }
            }
        }
        return false;
    }
}
