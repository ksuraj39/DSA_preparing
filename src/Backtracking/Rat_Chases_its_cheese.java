package Backtracking;

import java.util.Scanner;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int [][] ans = new int[n][m];
        allPath(maze,0,0,ans);
    }
static int val = 0;
    public static void allPath(char[][]maze,int cr,int cc,int[][] ans){
        // check every bound in range or not
        if(cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X'){
            return;
        }
        if(cr == maze.length-1 && cc == maze[0].length -1 ){
            display(ans);
            return;
        }


        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        allPath(maze,cr-1,cc,ans); // up
        allPath(maze,cr,cc-1,ans); // left
        allPath(maze,cr+1,cc ,ans); // down
        allPath(maze,cr,cc+1,ans); // right
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;


    }
    public static void display(int[][]arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
