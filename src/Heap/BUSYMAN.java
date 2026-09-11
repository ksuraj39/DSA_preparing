package Heap;

import java.util.Arrays;
import java.util.Scanner;


public class BUSYMAN {
    /*
            Jab bhi static main class hm koi class bante hai to static ki banate hain
     */
     static class Pair{
        int start;
        int end;
        Pair(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Pair [] arr = new Pair[n];

            for (int i = 0; i < n; i++) {
                int st = sc.nextInt();
                int et = sc.nextInt();
                arr[i] = new Pair(st,et);
            }

            Arrays.sort(arr,(a,b) -> a.end - b.end);

            int activatie = 1;

            int end = arr[0].end;
            for (int i = 1; i < n; i++) {

                if(arr[i].start >= end){
                    activatie++;
                    end = arr[i].end;
                }

            }

            System.out.println(activatie);
        }
    }
}
