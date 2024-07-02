# Day 66:
Question: Permutations<br/>
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]

Answer Approach:
For solving this question, (Using Backtracking Concept)
We built a function permute(nums) initializes an empty result list. Then inside the function check if the size of currentP equals the length of nums, then we added it to the result list.
Then for backtracking case iterate through each element in nums.
 - If the element hasn't been used (used[i] is false), add it to currentP, mark it as used (used[i] = true), and recursively call backtrack() to continue building permutations.
After this, backtrack by removing the last added element, marking it unused (used[i] = false).
At last, we return the result list as all valid permutations are collected.
