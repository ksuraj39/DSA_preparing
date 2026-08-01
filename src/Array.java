import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            while(true){
                if(sum == s){
                    System.out.println("YES");
                    break;
                } else if (sum > s) {
                    System.out.println("NO");
                    break;
                }else{
                    sum += x;
                }
            }
        }
    }
}
