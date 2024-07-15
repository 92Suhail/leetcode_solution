# Day 76:
Question: Search in Rotated Sorted Array ||<br/>
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).<br/>

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
<br/>
Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.<br/>

You must decrease the overall operation steps as much as possible.<br/>

 

Example 1:<br/>
Input: nums = [2,5,6,0,0,1,2], target = 0<br/>
Output: true<br/>

Example 2:<br/>
Input: nums = [2,5,6,0,0,1,2], target = 3<br/>
Output: false<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly initialise two pointers, left at the start and right at the end of the array. <br/>
Within a loop, it calculates the midpoint and checks if the target matches the midpoint value, returning true if found. It then identifies which half of the array is sorted based on comparisons between nums[left], nums[mid], and nums[right], adjusting the pointers accordingly to continue the search. If the loop concludes without finding the target, it returns false.<br/>
