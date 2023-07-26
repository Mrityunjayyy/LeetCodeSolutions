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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();

        rightView(root , ans , 0);
        return ans;
    }

    public void rightView(TreeNode curr , List<Integer> ans , int curr_depth)
    {

        //preorder traversal
        //NLR -- for left view 
        //NRL -- for right view
        if(curr == null) return;

        if(curr_depth == ans.size())
        {
            ans.add(curr.val);
        }

        rightView(curr.right , ans , curr_depth + 1);
        rightView(curr.left , ans , curr_depth + 1);
    }
}