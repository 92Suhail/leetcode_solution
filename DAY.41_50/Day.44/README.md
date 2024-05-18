# Day 44:
Question: Maximum Depth of Binary Tree<br/>
Given the root of a binary tree, return its maximum depth.<br/>
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.<br/>

Example 1:<br/>
Input: root = [3,9,20,null,null,15,7]<br/>
Output: 3<br/>

Example 2:<br/>
Input: root = [1,null,2]<br/>
Output: 2<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly check, if the root node is null, it means the tree is empty, so the depth is 0. Return 0 in this case.
And if the root node is not null, calculate the depth of the left and right subtrees recursively using the `maxDepth` method.<br/> 
Return the maximum depth between the left and right subtrees, plus 1 (to account for the current level).
This approach traverses the entire tree recursively and returns the maximum depth.<br/>

