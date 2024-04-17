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
    String smallestString ="";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return smallestString;
    }
    public void dfs(TreeNode root,String currString) {
        if(root == null) {
            return;
        }
        //char ch = root.val + 'a';// ASCII value of a  to get value of other character
        currString = (char)( root.val + 'a') + currString;
        if(root.left == null && root.right == null) {
            if(smallestString == "" || smallestString.compareTo(currString)>0) {
                smallestString = currString;
            }
            return;
        }
        dfs(root.left,currString);
        dfs(root.right,currString);
    }

}