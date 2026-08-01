package Two_array_leetcode;

import java.util.ArrayList;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int arr[] = {2,5,2};
        int k = 3287;
        System.out.println(addToArrayForm(arr,k));

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int i = num.length-1;
        int carry = 0;
        while (i >= 0 && k > 0) {
            int n1 = num[i];
            int n2 = k % 10;
            int sum = n1 + n2 + carry;
            res.add(sum % 10);
            carry = sum / 10;
            i--;
            k /= 10;
        }
        while (i >= 0) {
            int n1 = num[i];
            int sum = n1 + carry;
            res.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while (k > 0) {
            int n2 = k % 10;
            int sum = n2 + carry;
            res.add(sum % 10);
            carry = sum / 10;
            k /= 10;
        }
        if (carry > 0) {
            res.add(carry);
        }
        return res.reversed();
    }
}
