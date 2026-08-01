package String_Question;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] s = n.toCharArray();
        reverse(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
    public static void reverse(char[]arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

}
