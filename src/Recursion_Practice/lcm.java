package Recursion_Practice;

public class lcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        System.out.println(cal(a,b,Math.max(a,b)));
    }
    public static int cal(int a,int b,int ans){
        if(ans % a==0 && ans%b==0) return ans;
        return cal(a,b,ans+Math.max(a,b));
    }
}
