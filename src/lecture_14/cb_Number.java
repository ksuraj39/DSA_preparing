package lecture_14;

import java.util.Scanner;

public class cb_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        subString(s);
    }
    // length wise substring
    public static void subString(String s){
        int count = 0;
        boolean [] visited = new boolean[s.length()];
        for (int len = 1; len <=s.length() ; len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j-len;
                long num = Long.parseLong(s.substring(i,j));
                if (isCBNumber(num) && isVisited(visited,i,j)) {
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    // is part of cb or not
    public static boolean isVisited(boolean[] arr, int si,int ei){
        for (int k = si; k <ei; k++) {
            if (arr[k] == true){
                return false;
            }
        }
        return true;
    }
    // is cb or not
    public static boolean isCBNumber(long num){
        if(num==1 || num==0){
            return false;
        }
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(num%arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
