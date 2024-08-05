# Day: 86
Question: Unique Binary Search Trees<br/>
Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.<br/>


Example 1:<br/>
Input: n = 3<br/>
Output: 5<br/>

Example 2:<br/>
Input: n = 1<br/>
Output: 1<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly we creating an array dp where dp[i] represents the number of unique BSTs that can be formed with i nodes. Then initialize dp[0] and dp[1] to 1. For each i from 2 to n, compute dp[i] using the formula dp[i] = ∑ (dp[j] * dp[i-1-j]) for j from 0 to i-1, which sums the product of BST counts for left and right subtrees. Finally, dp[n] contains the number of unique BSTs for n nodes. <br/>
