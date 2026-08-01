package Recursion;

public class GlobalVariable {
    static int x = 10;
    public static void main(String[] args) {
        fun();
        System.out.println(x);
    }
    public static void fun() {
        System.out.println(x);
        x = 20;
    }
}
