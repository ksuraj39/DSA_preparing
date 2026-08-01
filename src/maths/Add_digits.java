package maths;

import java.util.Scanner;

public class Add_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(addDigits(n));
    }
    public static int addDigits(int num){
        if(num==0) return 0;

        int sum = 0;
        while(num>9){
            sum +=num%10;
            num/=10;
            if(sum>=10 && num==0) {
                num = sum;
                sum=0;
            }
        }
        return sum;
    }
}
