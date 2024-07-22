# Day 81:
Question: Subsets<br/>
Given an integer array nums of unique elements, return all possible 
subsets (the power set).<br/>
The solution set must not contain duplicate subsets. Return the solution in any order.<br/>

 

Example 1:<br/>
Input: nums = [1,2,3]<br/>
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]<br/>

Example 2:<br/>
Input: nums = [0]<br/>
Output: [[],[0]]<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly start with the result list containing only the empty subset, result = [[]].<br/>
Then for each number in the input array nums:<br/>
and for each existing subset in the result list:<br/>
Create a new subset by adding the current number to the existing subset. Then add the new subset to the result list. After processing all numbers, the result list contains all possible subsets of the input array.<br/>