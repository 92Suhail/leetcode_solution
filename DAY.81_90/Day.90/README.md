# Day: 90
Question: Path Sum<br/>
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.<br/>


Example 1:<br/>
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22<br/>
Output: true<br/>
Explanation: The root-to-leaf path with the target sum is shown.<br/>

Example 2:<br/>
Input: root = [1,2,3], targetSum = 5<br/>
Output: false<br/>
Explanation: There two root-to-leaf paths in the tree:<br/>
(1 --> 2): The sum is 3.<br/>
(1 --> 3): The sum is 4.<br/>
There is no root-to-leaf path with sum = 5.<br/>

Example 3:<br/>
Input: root = [], targetSum = 0<br/>
Output: false<br/>
Explanation: Since the tree is empty, there are no root-to-leaf paths.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly we at each node, if it is a leaf (both children are null), check if its value matches the remaining targetSum. For non-leaf nodes, subtract the node’s value from targetSum and recursively check both left and right subtrees with the updated targetSum. Return true if any path meets the condition, otherwise return false.
<br/>
