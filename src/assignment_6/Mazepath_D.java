package assignment_6;

import java.util.Scanner;

public class Mazepath_D {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        count = 0;
        path(0,0,m-1,n-1,"");
        System.out.println("\n"+count);
    }
    public static void path(int sr,int sc,int er,int ec,String ans){
        if(sr == er && sc == ec){
            System.out.print(ans +" ");
            count++;
            return;
        }
        if(sr > er || sc > ec) return;

        path(sr+1,sc,er,ec,ans+"V");
        path(sr,sc+1,er,ec,ans+"H");
//        path(sr+1,sc+1,er,ec,ans+"D");
    }
}
