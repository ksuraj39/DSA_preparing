package recursion_practise;

import java.util.Scanner;

public class Letter_Combinations_of_a_Phone_Number {
    static String[] key = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        count = 0;
        KeyPaid(n,"");
        System.out.println("\n"+count);
    }
    public static void KeyPaid(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch = ques.charAt(0);
        String get = key[ch-'0'];
        for (int i = 0; i < get.length(); i++) {
            KeyPaid(ques.substring(1), ans + get.charAt(i));
        }
    }
}
