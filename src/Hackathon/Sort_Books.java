package Hackathon;

import java.util.Scanner;

public class Sort_Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] sub = str.toCharArray();
        sort(sub);
        for (int i = 0; i < sub.length; i++) {
            System.out.print(sub[i]+" ");
        }
    }
    public static void sort(char[] arr){
        int noP = 0;
        int noC = 0;
        int noM = 0;

        for(char ele:arr){
            if(ele=='P'){
                noP++;
            } else if (ele=='C') {
                noC++;
            }else {
                noM++;
            }
        }

        int i = 0;
        while(i<noP){
            arr[i] = 'P';
            i++;
        }
        while(i<noC+noP){
            arr[i] = 'C';
            i++;
        }
        while(i<noM+noC+noP){
            arr[i] = 'M';
            i++;
        }
    }
}
