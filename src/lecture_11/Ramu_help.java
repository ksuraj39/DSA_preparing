package lecture_11;

import java.util.Scanner;

public class Ramu_help {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int m = sc.nextInt();     // no of rickshaws
            int n = sc.nextInt();     // no of cabs

            int[] rickshaws = new int[m];
            int[] cabs = new int[n];

            for (int i = 0; i < rickshaws.length; i++) {
                rickshaws[i] = sc.nextInt();
            }
            for (int i = 0; i < cabs.length; i++) {
                cabs[i] = sc.nextInt();
            }

            System.out.println(minimun_sum(rickshaws, cabs, c1, c2, c3, c4));
        }
    }

    // minimum sum

    public static int minimun_sum(int[] rickshaws,int[] cabs,int c1,int c2,int c3 ,int c4){
        int rickshaws_cost = 0;
        for(int i = 0;i<rickshaws.length;i++){
            rickshaws_cost += Math.min(rickshaws[i]*c1,c2);
        }
        rickshaws_cost = Math.min(rickshaws_cost,c3);

        int cabs_cost = 0;

        for(int i = 0;i<cabs.length;i++){
            cabs_cost += Math.min(cabs[i]*c1,c2);
        }
        cabs_cost = Math.min(cabs_cost,c3);

        int total = cabs_cost +rickshaws_cost;

        return Math.min(total,c4);
    }
}
