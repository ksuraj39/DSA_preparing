package assignment_3;

import java.util.Scanner;

public class Alex_Goes_Shopping {
    public static int Goes_Shopping(int []arr,int money){
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(money%arr[i]==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] price = new int[n];
        for (int i = 0;i < n;i ++){
            price[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        while(m-->0){
            int p = sc.nextInt();
            int item = sc.nextInt();
            if(Goes_Shopping(price,p)>=item){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
