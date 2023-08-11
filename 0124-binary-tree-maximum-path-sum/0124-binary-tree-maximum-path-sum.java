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
    public int maxPathSum(TreeNode root) {
        int[] res = {Integer.MIN_VALUE};
        solve(root , res);
        return res[0];
    }

    public int solve(TreeNode root , int[] res)
    {
        if(root == null) return 0;

        int left = solve(root.left , res);
        int right = solve(root.right , res);

        int temp_ans = Math.max( Math.max(left,right)+ root.val 
        , root.val);

        int ans = Math.max(temp_ans , left + right + root.val);

        res[0] = Math.max(res[0] , ans);


        return temp_ans;
    }
}