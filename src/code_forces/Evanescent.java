package code_forces;

import java.util.Scanner;

public class Evanescent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int g = comprassion(s);
            int ans = g;

            for (int i = 1; i < n - 1; i++) {
                int curr = g;
                boolean left = s.charAt(i) != s.charAt(i-1);
                boolean right = s.charAt(i) != s.charAt(i+1);

                if(left && right){
                    if(s.charAt(i-1) == s.charAt(i+1)){
                        curr -= 2;
                    }else{
                        curr -= 1;
                    }

                }

                ans = Math.min(ans,curr);
            }
            System.out.println(ans);
        }
    }

    public static int comprassion(String s) {
        int cnt = 1;
        for(int i = 1;i < s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                cnt++;
            }
        }
        return cnt;
    }
}
