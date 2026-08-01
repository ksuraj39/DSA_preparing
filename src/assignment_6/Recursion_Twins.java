package assignment_6;

import java.util.Scanner;

public class Recursion_Twins {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() < 3) System.out.println(0);
        count = 0;
        twins(s,2);
        System.out.println(count);
    }
    public static void twins(String s,int idx){
        if(idx >= s.length()) return;
        if(s.charAt(idx-2) == s.charAt(idx)){
            count++;
        }
        twins(s,idx+1);
    }
}
