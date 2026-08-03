package Sliding_window;

// Leetcode question name -> Maximum Number of Vowels in a Substring of Given Length
// question Number -> 1456   , level - medium

//   Constraints:
//        * 1 <= s.length <= 105
//        * s consists of lowercase English letters.
//        * 1 <= k <= s.length

public class Maximum_Number_of_Vowels {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;

        System.out.println(maxVowels(s,k));
    }

    // Solution tc -- O(n) , space -- O(1)
    public static int maxVowels(String s, int k) {
        int n = s.length();

        int maxlen = 0;
        int si = 0, ei = 0;    // si -- starting index,   ei -- ending index
        int count = 0;
        while(ei < n){
            char ch = s.charAt(ei);
            count += isVowel(ch);

            while(ei - si + 1 > k && si <= ei){
                count -= isVowel(s.charAt(si));
                si++;
            }

            maxlen = Math.max(maxlen,count);
            ei++;
        }
        return maxlen;
    }
    public static int isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return 1;
        }
        return 0;
    }
}
