package Recursion_Practice;

public class dec_to_bin {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(binForm(n,0,1));
    }
    public static int binForm(int n,int b,int mul){
        if(n==0) return b;
        b += (n%2)*mul;
        mul *= 10;
        return binForm(n/2,b,mul);
    }
}
