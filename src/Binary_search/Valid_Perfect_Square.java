package Binary_search;

import java.util.Scanner;

public class Valid_Perfect_Square {
    public static boolean Perfect_Square(int num){
        int low = 1;
        int high = num-1;
        while(low < high){
            int mid = (low +(high-low)/2);
            int sq = (int)mid*mid;
            if(sq== num) {
                return true;
            }else if (sq<num){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Perfect_Square(n));
    }
}
