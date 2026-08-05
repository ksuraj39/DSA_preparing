package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree(){
        this.root = CreateTree();
    }

    private Node CreateTree() {
        int val = sc.nextInt();

        Node nn = new Node(val);
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = CreateTree();
        }
        return nn;
    }
    public void DisPlay(){
        DisPlay(root);
    }
    private void DisPlay(Node root){
        if(root == null){
            return;
        }
        String s = "<-" + root.val + "->";

        if(root.left != null){
            s = root.left.val + s;
        }else{
            s = s + ".";
        }

        if(root.right != null){
            s =s +  root.right.val;
        }else{
            s = s + ".";
        }

        System.out.println(s);
        DisPlay(root.left);
        DisPlay(root.right);
    }
}
