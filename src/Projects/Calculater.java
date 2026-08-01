package Projects;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        // take input from user till does not press X or x
        int ans = 0;
        while(true){
            // take the operator as input
            System.out.print("Enter the operator :");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if(op == '+' ||op == '-' ||op == '*' ||op == '/' ||op == '%' ){
                // take two number input
                System.out.print("Enter two number :");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                //add
                if(op == '+'){
                    ans = num1+num2;
                }
                // subtract
                if(op == '-'){
                    ans = num1 - num2;
                }
                // multiple
                if(op == '*'){
                    ans = num1 * num2;
                }
                // divide
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                // module opertion
                if(op == '%'){
                    ans = num1 % num2;
                }
            } else if (op=='x' || op == 'X') {
                break;
            }else{
                System.out.println("Invalid operation !!....");
            }
            System.out.println(ans);
        }
    }
}
