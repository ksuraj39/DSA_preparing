package assignment_6;

import java.util.Scanner;

public class Replace_all_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            System.out.println(replace(s));
        }
    }
    public static String replace(String s){
        if(s.length()==0){
            return "";
        }
        if(s.length() >=2 && s.substring(0,2).equals("pi")){
            return 3.14+replace(s.substring(2));
        }
        return s.charAt(0) + replace(s.substring(1));
    }

}

