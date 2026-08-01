package CodeForce_Div_2;

import java.util.Scanner;

public class Divisible_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int l = 1,r = n;
            boolean turn = false;
            int [] res = new int[n];
            for (int i = n-1; i >=0 ; i--) {
                if(!turn){
                    res[i] = l++;
                }else{
                    res[i] = r--;
                }
                turn = !turn;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}
