package Recursion_Practice;

public class smalldigit {
    public static void main(String[] args) {
        int n = 942;
        System.out.println(digit(n,Integer.MAX_VALUE));
    }
    public static int digit(int n,int ans){
        if(n==0) return ans;
        if(ans > n%10){
            ans = n%10;
        }
        return digit(n/10,ans);
    }
}
