package assignment_6;

import java.util.Scanner;

public class Count_Remove_and_Replace_hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(counthi(s));
        remove(s,"");
        replace(s,"");

    }
    public static void remove(String s,String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        if(s.length()>=2 && s.charAt(0)=='h'&&s.charAt(1)=='i'){
            remove(s.substring(2),ans);
        }else{
            remove(s.substring(1),ans+s.charAt(0));
        }
    }
    public static void replace(String s,String ans){
        if (s.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if(s.length()>=2 && ch == 'h' && 'i' == s.charAt(1)){
            replace(s.substring(2),ans+"bye");
        }else{
            replace(s.substring(1),ans+ch);
        }
    }
    public static int counthi(String s){
        if(s.length()<2)return 0;
        if(s.length() >= 2 && s.charAt(0)=='h'&& s.charAt(1)=='i'){
            return 1+counthi(s.substring(2));
        }
        return counthi(s.substring(1));
    }
}
