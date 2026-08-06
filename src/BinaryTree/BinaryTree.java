package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
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

    // create tree function
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

    // display of tree
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

    // max element
    public int max(){
        return max(root);
    }
    private int max(Node root){
        if(root == null) return Integer.MIN_VALUE;

        int left = max(root.left);
        int right = max(root.right);
        return Math.max(root.val,Math.max(left,right));
    }

    // find element item
    public boolean find(int item){
        return find(root,item);
    }
    private boolean find(Node root, int item){
        if(root == null){
            return false;
        }
        if(root.val == item) return true;
        boolean left = find(root,item);
        boolean right = find(root,item);
        return left || right;
    }

    // height
    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left,right);
    }

    // pre order
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        if(root == null )return ;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // In order
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node root){
        if(root == null )return ;
        InOrder(root.left);
        System.out.print(root.val + " ");
        InOrder(root.right);
    }

    // post order
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node root){
        if(root == null )return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    // Level order
    public void Level(){
        Level(root);
    }
    private void Level(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node r = q.poll();
            System.out.print(r.val +" ");

            if(r.left != null) q.add(root.left);
            if(r.right != null) q.add(root.right);
        }
        System.out.println();
    }

}
