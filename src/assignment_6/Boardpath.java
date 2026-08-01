package assignment_6;

import java.util.Scanner;

public class Boardpath {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice = sc.nextInt();
        int target = sc.nextInt();
        count = 0;
        path(dice,target,0,"");
        System.out.println("\n"+count);
    }
    public static void path(int dice,int target,int sum,String ans){
        if(sum == target){
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(sum > target) return;
        for (int i = 1; i <=dice ; i++) {
            if(sum + i <= target){
                path(dice,target,sum + i,ans+i);
            }
        }
    }
}
