package code_forces;

import java.util.Scanner;

public class Marenol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int evenA = 0, oddA = 0;
            int evenB = 0, oddB = 0;

            for (int i = 0; i < n; i++) {

                if(a.charAt(i) == '1'){
                    if(i % 2 == 0) evenA++;
                    else{
                        oddA++;
                    }
                }

                if(b.charAt(i) == '1'){
                    if(i % 2 == 0) evenB++;
                    else{
                        oddB++;
                    }
                }

            }

            if(evenB == evenA && oddB==oddA){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
