# Day 16:
Question: 4Sum.<br/>
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:<br/>

0 <= a, b, c, d < n<br/>
a, b, c, and d are distinct.<br/>
nums[a] + nums[b] + nums[c] + nums[d] == target<br/>
You may return the answer in any order.<br/>

 

Example 1:<br/>
Input: nums = [1,0,-1,0,-2,2], target = 0<br/>
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]<br/>

Example 2:<br/>
Input: nums = [2,2,2,2,2], target = 8<br/>
Output: [[2,2,2,2]]<br/>


Answer Approach:<br/>
Initialize variables:"n" to store the length of the array nums, "ans" to store the resulting quadruplets.<br/>
If the length of the array is less than 4, return an empty list as there can't be any quadruplets.<br/>
Sort the array nums in ascending order. <br/>
Iterate through the array using two nested loops. The outer loop (i) starts from 0 and goes up to n - 3.<br/>
Skip duplicate elements by checking if the current element is the same as the previous one (nums[i] == nums[i - 1]). This helps in avoiding duplicate quadruplets.<br/>
The inner loop (j) starts from i + 1 and goes up to n - 2.<br/>
Skip duplicate elements similarly to the outer loop.<br/>
Use two pointers (k and l) to scan the array from both ends towards the middle.<br/>
Calculate the sum x of the four elements (nums[i], nums[j], nums[k], and nums[l]).<br/>
If x is less than the target, increment k.<br/>
If x is greater than the target, decrement l.<br/>
If x equals the target, add the quadruplet to the result list (ans), increment k, and decrement l.<br/>
Skip duplicate elements of nums[k] and nums[l] to avoid duplicate quadruplets.<br/>
Return the resulting list of quadruplets.<br/>