package code_forces.Rating800;

import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 0;i < n;i++){
            int pro = sc.nextInt();
            if(pro == 1) {
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "HARD" : "EASY");

    }
}
