# Day: 89
Question: Same Tree<br/>
Given the roots of two binary trees p and q, write a function to check if they are the same or not.<br/>
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.<br/>

 
Example 1:<br/>
Input: p = [1,2,3], q = [1,2,3]<br/>
Output: true<br/>

Example 2:<br/>
Input: p = [1,2], q = [1,null,2]<br/>
Output: false<br/>
<br/>
Example 3:<br/>
Input: p = [1,2,1], q = [1,1,2]<br/>
Output: false<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly check if both nodes are null, the trees are identical; if only one node is null, they are not identical. Next, if the current nodes' values differ, the trees are not identical. Finally, recursively check both the left and right subtrees.<br/>