# Day: 94
Question: Construct Binary Tree from Preorder and Inorder Traversal<br/>
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.<br/>

Example 1:<br/>
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]<br/>
Output: [3,9,20,null,null,15,7]<br/>

Example 2:<br/>
Input: preorder = [-1], inorder = [-1]<br/>
Output: [-1]<br/>
 

Answer Approach:<br/>
For solving his question,<br/>
Firstly we build a HashMap (inorderIndexMap) to store the index of each value from the inorder array for quick lookup.<br/>
Then check if the segment of the inorder array is invalid (inorderStart > inorderEnd), return null.<br/>
we use the current value in preorder (tracked by preorderIndex) to create the root node.<br/>
then we locate the root’s index in the inorder array using the map.<br/>
Build the left and right subtrees with the valid segments of the inorder array.<br/>
At last we increment preorderIndex to move to the next root value in the preorder array as the tree is constructed.<br/>
