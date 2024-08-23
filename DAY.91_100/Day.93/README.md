# Day: 93
Question: Symmetric Tree<br/>
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).<br/>

 
Example 1:<br/>
Input: root = [1,2,2,3,4,4,3]<br/>
Output: true<br/>

Example 2:<br/>
Input: root = [1,2,2,null,3,null,3]<br/>
Output: false<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly we recursively compare its left and right subtrees using a helper function. The tree is symmetric if both subtrees are mirrors of each other (meaning the left subtree's left child matches the right subtree's right child, and the left subtree's right child matches the right subtree's left child). <br/>
If the root is null, the tree is symmetric by default; otherwise, we verify symmetry by ensuring corresponding nodes are equal and their subtrees are mirror images of each other.<br/>
