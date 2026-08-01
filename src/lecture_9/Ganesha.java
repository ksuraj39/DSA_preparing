package lecture_9;

import java.util.Scanner;

public class Ganesha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= n ; j++) {
                if(j==n/2+1 || i==n/2+1){
                    System.out.print("* ");
                } else if (i < n/2+1 && j==1  ) {
                    System.out.print("* ");
                } else if (i > n/2+1 && j==n  ) {
                    System.out.print("* ");
                } else if (j > n/2+1 && i==1  ) {
                    System.out.print("* ");
                } else if (j < n/2+1 && i==n  ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
