# Day: 95
Question: Construct Binary Tree from Inorder and Postorder Traversal<br/>
Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.<br/>

 
Example 1:<br/>
Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]<br/>
Output: [3,9,20,null,null,15,7]<br/>

Example 2:<br/>
Input: inorder = [-1], postorder = [-1]<br/>
Output: [-1]<br/>
 
Answer Approach:<br/>
For solving this question,<br/>
Firstly create a HashMap to store the indices of values from the inorder array for quick access.<br/>
Then we initialize postorderIndex to the end of the postorder array, which helps in accessing the root values.<br/>
After that we define a recursive function buildTreeRecursive that:<br/>
Checks if the current subtree is empty (base case).<br/>
Gets the root value from the end of the postorder array and creates a TreeNode.<br/>
Finds the root's index in the inorder array.<br/>
Recursively builds the right subtree first.<br/>
Recursively builds the left subtree.<br/>
At last we construct tree with starting the construction by calling buildTreeRecursive with the full range of the inorder array.<br/>
