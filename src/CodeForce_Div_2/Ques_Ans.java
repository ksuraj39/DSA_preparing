package CodeForce_Div_2;

import java.util.Scanner;

public class Ques_Ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char [] chr = sc.next().toCharArray();
            int q = 0,a = 0;
            for(char ch : chr){
                if(ch == 'Q'){
                    q++;
                }else {
                    q = Math.max(0,q-1);
                }
            }

            if(q == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
