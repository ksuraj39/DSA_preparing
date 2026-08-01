package Elementary_Coding_1;

import java.util.Scanner;

public class Sum_of_Last_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1%10 + n2%10;
        System.out.println("Sum of last digit of two number : "+sum);
    }
}
