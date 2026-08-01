package Recursion_Practice;

public class digitalRoot {
    public static void main(String[] args) {
        int n = 987;
        System.out.println(root(n));

    }
    public static int root(int n){
        if(n<10) return n;
        return root(n%10+root(n/10));
    }
}
