package code_forces.Rating800;

import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        while(k > 0){
            int rem = n % 10;
            if(rem == 0){
                n/=10;
            }else{
                n--;
            }
            k--;
        }
        System.out.println(n);
    }
}
