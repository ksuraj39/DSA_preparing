package maths;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1110110101";
        String b = "1110111011";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        long num1 = Long.parseLong(a);
        long num2 = Long.parseLong(b);
        long sum = 0,carry=0,mul=1;
        while(num1>0 && num2>0){
            long rem = carry+ (num1%10 + num2%10);
            sum = sum + (rem%2)*mul;
            mul*=10;
            carry = rem/2;
            num1/=10;
            num2/=10;
        }
        while(num1>0 ){
            long rem = carry+ (num1%10 + num2%10);
            sum = sum + (rem%2)*mul;
            mul*=10;
            carry = rem/2;
            num1/=10;
        }
        while( num2>0){
            long rem = carry+ (num1%10 + num2%10);
            sum = sum + (rem%2)*mul;
            mul*=10;
            carry = rem/2;
            num2/=10;
        }
        sum = sum +carry*mul;
        return String.valueOf(sum);
    }
}
