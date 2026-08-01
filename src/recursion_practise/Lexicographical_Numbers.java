package recursion_practise;

import java.util.Scanner;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Lexicographical(0,n);
    }
    public static void Lexicographical(int curr , int n){
        if (curr > n){
            return;
        }
        System.out.print(curr+" ");
        int i = 0;
        if(curr == 0){
            i = 1;
        }
        for (; i <= 9 ; i++) {
            Lexicographical(curr * 10 +i,n);
        }
    }
}
