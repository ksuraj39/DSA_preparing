package String_Question;

import java.util.Scanner;

public class Reverse_Vowels_of_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int left = 0,right = arr.length-1;

        while(left<right){

            // when left is vowel
            while(left<right && !isVowel(arr[left])){
                left++;
            }

            // when right is vowel
            while(left<right && !isVowel(arr[right])){
                right--;
            }

            // swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
     public static boolean isVowel(char ch){
        char [] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        for(char ele : vowel){
            if(ch==ele) return true;
        }
         return false;
     }
}
