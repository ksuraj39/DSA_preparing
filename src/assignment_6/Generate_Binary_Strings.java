package assignment_6;

import java.util.Scanner;

public class Generate_Binary_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            generate_binary(s,"");
        }
    }
    public static void generate_binary(String s,String ans){
        if(s.length()==0){
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(0);
        if(ch == '?'){
            generate_binary(s.substring(1),ans+'0');
            generate_binary(s.substring(1),ans+'1');
        }else {
            generate_binary(s.substring(1), ans + ch);
        }
    }
}
