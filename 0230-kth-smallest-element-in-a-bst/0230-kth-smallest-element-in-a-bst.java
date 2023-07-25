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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        solve(al , root , k);

        return al.get(k-1);
    }


    public void solve(ArrayList<Integer> al , TreeNode root , int k)
    {
        if(al.size()  != k)
        {
            if(root == null)
            return;

            solve(al , root.left ,k);
            al.add(root.val);
            solve(al , root.right , k);
        }
    }
}