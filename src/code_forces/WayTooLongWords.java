package code_forces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            String s = sc.next();
            int len = s.length();
            if( len > 10){
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(0));
                len -= 2;
                sb.append(len);
                sb.append(s.charAt(s.length()-1));
                System.out.println(sb);
            }else{
                System.out.println(s);
            }
        }
    }
}
