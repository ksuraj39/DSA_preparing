package BinaryTree;
import java.lang.reflect.Parameter;
import java.util.* ;

public class Maximum_Width_of_Binary_Tree {

      // Definition for a binary tree node.
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

    class Solution {
        class Pair{
            TreeNode node;
            int idx;
            Pair(TreeNode node,int idx){
                this.node = node;
                this.idx = idx;
            }
        }
        public int widthOfBinaryTree(TreeNode root) {
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(root,0));
            int maxWidth = 0;

            while(!q.isEmpty()){

                Pair start = q.peek();
                int si = q.size();
                Pair end = start;
                for (int i = 0; i < si; i++) {
                    Pair curr = q.poll();
                    end = curr;

                    if(curr.node.left != null){
                        q.add(new Pair(curr.node.left,curr.idx * 2 + 1));
                    }

                    if(curr.node.right != null){
                        q.add(new Pair(curr.node.right,curr.idx * 2 + 2));
                    }
                }
                // width
                maxWidth = Math.max(maxWidth,end.idx - start.idx + 1);

            }

            return maxWidth;
        }
    }
}
