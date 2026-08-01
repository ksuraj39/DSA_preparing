package Sliding_window;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        int flipA = Maximum_len(str,k,'a');
        int flipB = Maximum_len(str,k,'b');

        System.out.println(Math.max(flipA,flipB));
    }
    public static int Maximum_len(String str,int k,char ch){
        int ans=0,si=0,ei=0,flip=0;
        while (ei<str.length()){
            // window grow
            if(str.charAt(ei)==ch){
                flip++;
            }
            // window shrink
            while(flip>k && si<=ei){
                if (str.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }
            // updated answer
            ans = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
