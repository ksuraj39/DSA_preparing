package lecture_12;

import java.util.Scanner;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int nob = sc.nextInt();     // number of books
            int nos = sc.nextInt();     // number of students
            int[] page = new int[nob];
            for (int i = 0; i < page.length; i++) {
                page[i] = sc.nextInt();
            }
            System.out.println(minimumPage(page,nos));
        }
    }
    public static int minimumPage(int []page,int nos){
        int low = 0;
        int high = 0;
        int ans = 0;
        for (int i =0 ;i<page.length;i++){
            high+=page[i];
        }
        while(low<=high){
            int mid = (high+low)/2;
            if(isposible(page,nos,mid)){
                ans = mid;
                high = mid-1;
            }else {
                low = mid +1;
            }
        }
        return ans;
    }
    public static boolean isposible(int []arr,int nos,int mid){
        int student = 1;
        int read_page = 0;
        for (int i =0;i< arr.length;){
            if(read_page+arr[i]<=mid){
                read_page += arr[i];
                i++;
            }else  {
                student++;
                read_page = 0;
            }
            if(student>nos){
                return false;
            }
        }
        return true;
    }
}
