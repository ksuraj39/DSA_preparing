package Recursion_Practice;

public class RemoveZores {
    public static void main(String[] args) {
        int n = 12030;
        System.out.println(removes(n,0,1));
    }
    public static int removes(int n,int ans,int mul){
        if(n==0) return ans;
        if(n%10!=0) {
            ans = ans + (n%10)*mul;
            mul *= 10;
        }
        return removes(n/10,ans,mul);
    }
}
