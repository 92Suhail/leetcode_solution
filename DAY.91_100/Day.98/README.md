# Day: 98
Question: Count Complete Tree Nodes<br/>
Given the root of a complete binary tree, return the number of the nodes in the tree.<br/>

According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.<br/>

Design an algorithm that runs in less than O(n) time complexity.<br/>

 

Example 1:<br/>
Input: root = [1,2,3,4,5,6]<br/>
Output: 6<br/>

Example 2:<br/>
Input: root = []<br/>
Output: 0<br/>

Example 3:<br/>
Input: root = [1]<br/>
Output: 1<br/>
 

Answer Approach:<br/>
For solving this question,<br/>
Firstly we determine the height of the leftmost and rightmost paths in the tree.<br/>
If the heights are equal, the tree's left subtree is a perfect binary tree. Use the formula (2^height)−1 to calculate its nodes, then recursively count nodes in the right subtree.<br/>
If the heights differ, the right subtree is a perfect binary tree. Again, use the formula for the right subtree and recursively count nodes in the left subtree.<br/>
Sum up the counts from the subtrees plus the root.<br/>