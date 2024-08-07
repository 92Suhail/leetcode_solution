# Day 70:
Question: Combination Sum<br/>
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.<br/>

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency of at least one of the chosen numbers is different.<br/>

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.<br/>

 

Example 1:<br/>
Input: candidates = [2,3,6,7], target = 7<br/>
Output: [[2,2,3],[7]]<br/>
Explanation:<br/>
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.<br/>
7 is a candidate, and 7 = 7.<br/>
These are the only two combinations.<br/>

Example 2:<br/>
Input: candidates = [2,3,5], target = 8<br/>
Output: [[2,2,2,2],[2,3,3],[3,5]]<br/>

Example 3:<br/>
Input: candidates = [2], target = 1<br/>
Output: []<br/>


Answer Approach:<br/>
For solving this question,<br/>
Start with an empty list to store the results and call a helper method to perform the backtracking.<br/>
Check if the target is zero, add the current combination to the result list.<br/>
If the target is negative, stop the current path as it exceeds the target.<br/>
For each candidate starting from the current index, add the candidate to the current combination, recursively reduce the target by the candidate's value, and call the helper method again. After returning, remove the last candidate to explore other combinations.<br/>
