package Elementary_Coding_1;

import java.util.Scanner;

public class Last_Digit_of_the_Given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Last digit of number : "+ n%10);
    }
}
