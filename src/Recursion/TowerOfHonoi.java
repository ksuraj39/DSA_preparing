package Recursion;

public class TowerOfHonoi {
    static  int count ;
    public static void main(String[] args) {
        count = 0;
        honoi(3,"A","B","C");
        System.out.println();
        System.out.println(count);
    }
    public static void honoi(int n,String src,String help,String des){
        if(n==0){
            return;
        }

        // src to dec
        honoi(n-1,src,des,help);
        System.out.println("Move " + n +"th disk from " + src + " to " + des );
        count++;
        honoi(n-1,help,src,des);
    }
}
