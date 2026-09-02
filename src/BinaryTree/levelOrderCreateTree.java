package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class levelOrderCreateTree {
    class Node{
        Node left;
        Node right;
        int val;
        Node (int val){
            this.val = val;
        }
    }
    private Node root;
    public levelOrderCreateTree(){
        CreateTree();
    }

    private void CreateTree() {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        Node nn = new Node(item);
        root = nn;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node curr = q.remove();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            if(c1 != -1){
                Node n = new Node(c1);
                curr.left = n;
                q.add(n);
            }
            if(c2 != -1){
                Node n = new Node(c1);
                curr.right = n;
                q.add(n);
            }
        }
    }

    public static void main(String[] args) {

    }
}
