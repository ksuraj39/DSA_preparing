import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // test case condition
        while(t-->0) {
            int s = sc.nextInt();   // sand girne ka time
            int k = sc.nextInt();   // flip karne ka time
            int m = sc.nextInt();   // vandim ke jane ka time

            if (s <= k) {
                System.out.println(Math.max(0, s - m % k));
            } else {
                int duration = m % (2 * k) < k ? s - m % k : k - m % k;
                System.out.println(duration);
            }
        }
    }
}
