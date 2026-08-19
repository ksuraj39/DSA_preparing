package BinaryTree;


import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public static void main(String[] args) {

    }


//      Definition for a binary tree node.

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> ll = new ArrayList<>();

            allPathSum(root,targetSum,ll,res);
            return res;
        }

        // Path sum I
        public boolean hasPath(TreeNode root,int target){
            if(root == null) return false;

            if(root.left == null && root.right == null){
                return target - root.val == 0;
            }
            boolean left = hasPath(root.left,target - root.val);
            boolean right = hasPath(root.right,target - root.val);

            return left || right;

        }
        // Path sum II
        public void allPathSum(TreeNode root,int targetSum,List<Integer> ll,List<List<Integer>> res){
            if(root == null)  return;

            ll.add(root.val);
            if(root.left == null && root.right == null){
                if(targetSum == root.val){
                    res.add(new ArrayList<>(ll));
                }
            }
            allPathSum(root.left,targetSum - root.val,ll,res);
            allPathSum(root.right,targetSum - root.val,ll,res);
            ll.remove(ll.size()-1);
        }
    }

