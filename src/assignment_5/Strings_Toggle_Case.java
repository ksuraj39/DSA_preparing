package assignment_5;

import java.util.Scanner;

public class Strings_Toggle_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toggleCase(s));

    }
    public static String toggleCase (String s){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch>='a'&& ch<='z'){
                ans.append((char)(ch-32));
            } else if (ch>='A'&& ch<='Z') {
                ans.append((char)(ch+32));
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
