package BinaryTree;


import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class MorrisTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();

        TreeNode curr = root;
        while (curr != null){

            if(curr.left != null){
                // find predecessor
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr){
                    pred = pred.right;
                }

                if(pred.right == null){ // link
                    pred.right = curr;
                    curr = curr.left;
                }else {  // pred.right = curr   ---- unlink farzi

                    pred.right = null;
                    ll.add(curr.val);
                    curr = curr.right;

                }

            }else{
                ll.add(curr.val);
                curr = curr.right;
            }
        }

        return ll;

    }
}
