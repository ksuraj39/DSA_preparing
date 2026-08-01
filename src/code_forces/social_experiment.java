package code_forces;

import java.util.Scanner;

public class social_experiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            if (n<=3){
                System.out.println(n);
            }else{
                System.out.println(n%2);
            }
        }
    }
}
