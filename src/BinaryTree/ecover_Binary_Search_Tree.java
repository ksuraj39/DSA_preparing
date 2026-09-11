package BinaryTree;

import java.util.*;

public class ecover_Binary_Search_Tree {

        //    Definition for a binary tree node.
        public class TreeNode {
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

        public void recoverTree(TreeNode root) {
            List<TreeNode> ll = new ArrayList<>();
            inOrder(root,ll);

            TreeNode first = null;
            TreeNode second = null;

            for (int i = 0; i < ll.size()-1; i++) {
                if(ll.get(i).val > ll.get(i+1).val){
                    first = ll.get(i);
                    break;
                }
            }

            for (int i = ll.size()-1; i > 0; i--) {
                if(ll.get(i).val > ll.get(i-1).val){
                    second = ll.get(i);
                    break;
                }
            }

            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }

        public void inOrder(TreeNode root, List<TreeNode> ll) {
            if(root == null)return;
            inOrder(root,ll);
            ll.add(root);
            inOrder(root,ll);
        }
}
