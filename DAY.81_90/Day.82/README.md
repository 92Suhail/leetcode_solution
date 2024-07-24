# Day 82:
Question: Subsets ||<br/>
Given an integer array nums that may contain duplicates, return all possible 
subsets (the power set).<br/>
The solution set must not contain duplicate subsets. Return the solution in any order.<br/>

 
Example 1:<br/>
Input: nums = [1,2,2]<br/>
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]<br/>

Example 2:<br/>
Input: nums = [0]<br/>
Output: [[],[0]]<br/>


Answer Approach:<br/>
For solving this question, <br/>
Firstly initializes with a HashSet result to store unique subsets, sorts nums to group duplicates, and starts with an empty subset. It iterates through each number in nums, generating new subsets by appending the number to existing subsets stored in result. By manipulating a HashSet, duplicates are automatically managed, ensuring only unique subsets are retained. Finally, it converts the HashSet to a List and returns it.<br/>