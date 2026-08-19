package code_forces.Rating800;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int lower = 0;
        int upper = 0;

        for (char ch : s.toCharArray()) {

            if(Character.isUpperCase(ch)){
                upper++;
            }else{
                lower++;
            }
        }

        System.out.println((lower >= upper)? s.toLowerCase() : s.toUpperCase());
    }
}
