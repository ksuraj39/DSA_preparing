package Recursion;

public class Generate_Parentheses {
    public static void main(String[] args) {
        int n = 3;
        generate(n, 0, 0, "");

    }
    public static void generate(int n,int open,int close,String ans){
        if(open == n && close == n){
            System.out.println(ans);
            return;
        }
        if(open > n || close > open){
            return;
        }
        generate(n,open+1,close,ans+"(");
        generate(n,open,close+1,ans+")");
    }
}
