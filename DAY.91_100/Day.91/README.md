# Day: 91
Question: Path Sum ||<br/>
Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.<br/>
A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.<br/>


Example 1:<br/>
Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22<br/>
Output: [[5,4,11,2],[5,8,4,5]]<br/>
Explanation: There are two paths whose sum equals targetSum:<br/>
5 + 4 + 11 + 2 = 22<br/>
5 + 8 + 4 + 5 = 22<br/>

Example 2:<br/>
Input: root = [1,2,3], targetSum = 5<br/>
Output: []<br/>

Example 3:<br/>
Input: root = [1,2], targetSum = 0<br/>
Output: []<br/>
 
 
Answer Approach:<br/>
For solving this question,(Using DFS)<br/>
Firstly we traverse the tree while maintaining a path list and the remaining sum. Add the current node’s value to the path and check if you reach a leaf node with the exact target sum; if so, add the path to the results. After exploring a node's children, backtrack by removing the node from the path to continue exploring other possibilities.<br/>
