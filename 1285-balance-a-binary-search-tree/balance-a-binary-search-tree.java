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
    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public TreeNode construct(int l, int r, List<Integer> list) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = construct(l, mid - 1, list);
        root.right = construct(mid + 1, r, list);
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return construct(0, list.size() - 1, list);
    }
}