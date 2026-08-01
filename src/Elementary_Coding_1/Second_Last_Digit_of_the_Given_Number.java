package Elementary_Coding_1;

import java.util.Scanner;

public class Second_Last_Digit_of_the_Given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count  = 0;
        int num = 0;
        while(n>0){
            int rem = n%10;
            count++;
            if(count==2){
                num = rem;
                break;
            }
            n/=10;
        }
        System.out.println("second last digit number : "+ num);
    }
}
