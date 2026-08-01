package String_Question;

import java.util.Scanner;

public class Playings_with_Good_String {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestlength(s));
    }
    public static int longestlength(String s){
        int ans = 0;
        int count= 0;
        for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if(isvowel(ch)){
               count++;
           }else{
               ans = Math.max(ans,count);
               count = 0;
           }
        }
        ans = Math.max(ans,count);
        return ans;
    }

    public static boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
