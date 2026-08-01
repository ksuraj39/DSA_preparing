package Backtracking;

public class Consecutive_1_Not_allowed {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generate_binary_String(n,""));
    }
    public static int generate_binary_String(int n,String ans){
        int len = ans.length();
        if(len >= 2 && ans.charAt(len-1) =='1' && ans.charAt(len-2) == '1'){
            return 0;
        }
        if(n == 0){
            System.out.print(ans+ " ");
            return 1;
        }
        int c = 0;
        c += generate_binary_String(n-1,ans+'0');
        c += generate_binary_String(n-1,ans + '1');
        return c;
    }
}
