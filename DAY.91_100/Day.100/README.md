# Day: 100
Question: Binary Tree Postorder Traversal<br/>
Given the root of a binary tree, return the postorder traversal of its nodes' values.<br/>


Example 1:<br/>
Input: root = [1,null,2,3]<br/>
Output: [3,2,1]<br/>

Example 2:<br/>
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]<br/>
Output: [4,6,7,5,2,9,8,3,1]<br/>

Example 3:<br/>
Input: root = []<br/>
Output: []<br/>

Example 4:<br/>
Input: root = [1]<br/>
Output: [1]<br/>

 
Answer Approach:<br/>
For solving this question,<br/>
Firstly initialize an empty list to store the traversal result.<br/>
Then after using a helper function that recursively traverses the tree which do first, recursively traverse the left subtree. then, recursively traverse the right subtree.<br/>
Finally, add the value of the current node to the result list.<br/>
Return the result list after the entire tree has been traversed.<br/>