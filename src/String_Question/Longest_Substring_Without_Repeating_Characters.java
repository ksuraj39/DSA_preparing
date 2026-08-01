package String_Question;

import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] last_idx = new int[128];
        for (int i = 0; i < 128; i++) {
            last_idx[i] = -1;
        }
        int maxlen = 0;
        int si = 0,ei = 0;
        // sliding window
        while(ei<s.length()){
            char ch = s.charAt(ei);
            //shrink
            if(last_idx[ch] >= si && last_idx[ch] != -1){
                si = last_idx[ch]+1;
            }
            last_idx[ch] = ei;
            ei++;
            // update ans
            maxlen = Math.max(maxlen,ei-si);
        }
        return maxlen;
    }
}
