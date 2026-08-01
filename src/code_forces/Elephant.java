package code_forces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // that co-ordinate which have elephant's friend
        // 1 2 3 4 5 only moves at the times
        System.out.println((x+4)/5);
    }
}
