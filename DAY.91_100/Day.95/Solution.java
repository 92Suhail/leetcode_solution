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
    private Map<Integer, Integer> inorderIndexMap;
    private int postorderIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        postorderIndex = postorder.length - 1;
        return buildTreeRecursive(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeRecursive(int[] inorder, int[] postorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) {
            return null;
        }
        
        int rootValue = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootValue);
        int inorderRootIndex = inorderIndexMap.get(rootValue);
        root.right = buildTreeRecursive(inorder, postorder, inorderRootIndex + 1, inorderEnd);
        root.left = buildTreeRecursive(inorder, postorder, inorderStart, inorderRootIndex - 1);
        return root;
    }
}
