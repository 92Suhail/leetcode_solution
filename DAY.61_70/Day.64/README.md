# Day 64:
Question: Maximum Subarray<br/>
Given an integer array nums, find the subarray with the largest sum, and return its sum.
<br/>
 
Example 1:<br/>
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]<br/>
Output: 6<br/>
Explanation: The subarray [4,-1,2,1] has the largest sum 6.<br/>

Example 2:<br/>
Input: nums = [1]<br/>
Output: 1<br/>
Explanation: The subarray [1] has the largest sum 1.<br/>

Example 3:<br/>
Input: nums = [5,4,-1,7,8]<br/>
Output: 23<br/>
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.<br/>

Answer Approach:<br/>
For solving this question,<br/>
Firstly initialise currentSum and maxSum to the first element of the array.<br/>
Then after start iterating loop through the array starting from the second element.<br/>
For each element, update currentSum to be the maximum of the current element alone or the sum of currentSum and the current element (This is because whether to start a new subarray at the current element or to continue adding to the existing subarray).<br/>
Then update maxSum to be the maximum of maxSum and currentSum.<br/>
At last, return maxSum as the largest sum of any subarray found.<br/>

