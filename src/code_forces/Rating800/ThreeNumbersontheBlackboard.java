package code_forces.Rating800;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumbersontheBlackboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int [] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            Arrays.sort(arr);

            System.out.println(Math.min(arr[2] - arr[0], arr[1]));
        }
    }
}
