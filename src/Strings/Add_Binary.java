package Strings;

public class Add_Binary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));

    }
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder bin = new StringBuilder();
        int carry = 0;
        while(i >=0 && j >= 0){
            int n1 = a.charAt(i)-'0';
            int n2 = b.charAt(j) - '0';
            int sum = n1+n2 + carry;
            bin.append(sum % 2);
            carry = sum/2;
            i--;
            j--;
        }
        while(i >=0){
            int n1 = a.charAt(i)-'0';
            int sum = n1+carry;
            bin.append(sum%2);
            carry = sum/2;
            i--;
        }

        while(j >=0){
            int n2 = b.charAt(j)-'0';
            int sum = n2+carry;
            bin.append(sum%2);
            carry = sum/2;
            j--;
        }
        if(carry == 1){
            bin.append(carry);
        }
        return bin.reverse().toString();
    }
}
