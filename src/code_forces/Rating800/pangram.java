package code_forces.Rating800;

import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.toLowerCase();

        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int f : freq){
            if(f == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
