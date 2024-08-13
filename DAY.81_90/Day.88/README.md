# Day: 88
Question: Unique Binary Search Tree ||<br/>
Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of unique values from 1 to n. Return the answer in any order.<br/>

Example 1:<br/>
Input: n = 3<br/>
Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]<br/>

Example 2:<br/>
Input: n = 1<br/>
Output: [[1]]<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly we use a recursive approach where each number from 1 to n is the root. For each root i, recursively generate all possible left and right subtrees using numbers within the ranges [start, i-1] and [i+1, end], respectively. Combine each left subtree with each right subtree and the current root node to form unique BSTs. If the range is invalid (start > end), return a list with a single null to represent an empty subtree. <br/>
