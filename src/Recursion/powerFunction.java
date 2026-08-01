package Recursion;

public class powerFunction {
    public static void main(String[] args) {
        int a=2;
        int n=4;
        System.out.println((int)pow(a,n));
    }
    public static double pow(int a ,int n){
        if(n==0) return 1;
        return a*pow(a,n-1);
    }
}
