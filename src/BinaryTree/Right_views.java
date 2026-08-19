package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Right_views {

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDepth = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Rightveiw(root,0,ans);
        return ans;
    }
    public void Rightveiw(TreeNode root,int level,List<Integer> ans){
        if(root == null){
            return;
        }

        if(maxDepth < level){
            maxDepth = level;
            ans.add(root.val);
        }

        Rightveiw(root.right,level+1,ans);
        Rightveiw(root.left,level+1,ans);
    }
}
