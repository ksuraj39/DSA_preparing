package maths;

public class AddBinary_2 {
    public static void main(String[] args) {
        String a = "1110110101";
        String b = "1110111011";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        StringBuilder adder = new StringBuilder();
        while(m>=0 && n>=0){
            int n1 = a.charAt(m)-'0';
            int n2 = b.charAt(n)-'0';
            int sum = (n1^n2^carry);
            carry = (n1&n2)|(n1&carry)|(n2&carry);
            adder.append(sum);
            m--;
            n--;
        }
        while(m>=0){
            int n1 = a.charAt(m)-'0';
            int sum = (n1^carry);
            carry = (n1&carry);
            adder.append(sum);
            m--;
        }
        while(n>=0){
            int n2 = b.charAt(n)-'0';
            int sum = (n2^carry);
            carry = (n2&carry);
            adder.append(sum);
            n--;
        }
        adder.append(carry);
        return adder.reverse().toString();
    }
}
