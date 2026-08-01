package assignment_6;

import java.util.Scanner;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generates(0,0,n,"");
    }
    public static void generates(int left,int right,int n,String ans){
        if(left == n && right == n){
            System.out.println(ans);
        }
        if(right > left || right > n) return;
        if(left > n) return;
        generates(left,right+1,n,ans+")");
        generates(left+1,right,n,ans+"(");

    }
}
