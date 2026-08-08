package code_forces;

import java.util.*;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int ans = 0;

        for (int i = 0; i < a.length(); i++) {
            if(Character.toLowerCase(a.charAt(i)) > Character.toLowerCase(b.charAt(i))){
                ans = 1;
                break;
            }

            if(Character.toLowerCase(a.charAt(i)) < Character.toLowerCase(b.charAt(i))){
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}
