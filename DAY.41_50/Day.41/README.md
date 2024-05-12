# Day 41:
Question: Binary Tree Inorder Traversal<br/>
Given the root of a binary tree, return the inorder traversal of its nodes' values.<br/>

 
Example 1:<br/>
Input: root = [1,null,2,3]<br/>
Output: [1,3,2]<br/>

Example 2:<br/>
Input: root = []<br/>
Output: []<br/>

Example 3:<br/>
Input: root = [1]<br/>
Output: [1]<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly creating an empty ArrayList `result` to store the inorder traversal result.
then create a Stack named `stack` to keep track of nodes while traversing the tree.
Initialize a `current` variable to start traversal from the root node.<br/>

Then after start a loop that continues until either the current node becomes null and the stack becomes empty.<br/>
Inside loop:<br/>
 - While the current node is not null, push the current node onto the stack and move to its left child. This step simulates going left in the tree.<br/>
 - Once a leaf node (null) is reached, pop a node from the stack. This node represents the leftmost node in the current subtree that hasn't been visited yet.<br/>
 - Add the value of the popped node to the `result` list.<br/>
 - Move to the right child of the popped node. If the right child is not null, the loop will eventually push it onto the stack and continue traversing its left subtree.<br/>
After the traversal loop finishes, return the `result` list containing the inorder traversal of the binary tree.<br/>

