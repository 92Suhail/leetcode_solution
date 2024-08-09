# Day: 87
Question: Validate Binary Search Tree<br/>
Given the root of a binary tree, determine if it is a valid binary search tree (BST).<br/>

A valid BST is defined as follows:<br/>

The left subtree of a node contains only nodes with keys less than the node's key.<br/>
The right subtree of a node contains only nodes with keys greater than the node's key.<br/>
Both the left and right subtrees must also be binary search trees.<br/>
 
Example 1:<br/>
Input: root = [2,1,3]<br/>
Output: true<br/>

Example 2:<br/>
Input: root = [5,1,4,null,null,3,6]<br/>
Output: false<br/>
Explanation: The root node's value is 5 but its right child's value is 4.<br/>



Answer Approach:<br/>
For solving this question,<br/>
Firstly we checks each node to ensure its value lies within a specified range (min to max). <br/>
The base case handles null nodes, treating them as valid. For non-null nodes, the function ensures that the node's value is greater than the min and less than the max, and recursively checks the left subtree with an updated max and the right subtree with an updated min. we also ensures that all nodes in the left subtree are less than the root node's value, and all nodes in the right subtree are greater.<br/>

