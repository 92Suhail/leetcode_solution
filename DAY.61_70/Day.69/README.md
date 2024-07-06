# Day 69:
Question: Permutation ||<br/>
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.<br/>

 
Example 1:<br/>
Input: nums = [1,1,2]<br/>
Output:<br/>
[[1,1,2],<br/>
 [1,2,1],<br/>
 [2,1,1]]<br/>

Example 2:<br/>
Input: nums = [1,2,3]<br/>
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]<br/>
 


Answer Approach:<br/>
For solving this question, (Using backtracking)<br/>
Firstly sorting the input array to ensure that duplicate elements are adjacent, then implementing a backtracking algorithm to recursively generate all permutations while skipping duplicate elements by checking if the current element is the same as the previous one and if the previous element has not been used before, and finally storing each complete permutation in a result list and returning the list once all permutations have been generated.<br/>
