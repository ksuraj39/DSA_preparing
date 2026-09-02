package code_forces.Rating800;

import java.util.HashSet;
import java.util.Scanner;

public class Beautifulyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
         year++;
         while (true){
             int temp = year;
             HashSet<Integer> set = new HashSet<>();
             while(temp != 0){
                 set.add(temp%10);
                 temp /= 10;
             }

             if(set.size() == 4){
                 System.out.println(year);
                 return;
             }
             year++;
         }
    }
}
