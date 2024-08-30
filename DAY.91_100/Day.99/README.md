# Day: 99
Question: Binary Tree Preorder Traversal<br/>
Given the root of a binary tree, return the preorder traversal of its nodes' values.
<br/>
 
Example 1:<br/>
Input: root = [1,null,2,3]<br/>
Output: [1,2,3]<br/>

Example 2:<br/>
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]<br/>
Output: [1,2,4,5,6,7,3,8,9]<br/>

Example 3:<br/>
Input: root = []<br/>
Output: []
<br/>
Example 4:<br/>
Input: root = [1]<br/>
Output: [1]<br/>

 
Answer Approach:<br/>
For solving this question,<br/>
Firstly initialize an empty list to store the traversal result.<br/>
Then visit the root node and add its value to the result list. Then after that recursively traverse the left subtree. then, recursively traverse the right subtree.<br/>
If the current node is null, return without adding anything, skipping over empty subtrees.<br/>