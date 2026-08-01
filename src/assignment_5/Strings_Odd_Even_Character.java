package assignment_5;

import java.util.Scanner;

public class Strings_Odd_Even_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length() ; i++) {
            if(i%2==0){
                 System.out.print((char)(s.charAt(i)+1));
            }else {
                System.out.print((char) (s.charAt(i)-1));
            }
        }
    }
}
