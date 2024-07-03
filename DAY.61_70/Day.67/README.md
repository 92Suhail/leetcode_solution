# Day 67:
Question: Search in Rotated Sorted Array<br/>
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

Example 1:<br/>
Input: nums = [4,5,6,7,0,1,2], target = 0<br/>
Output: 4<br/>

Example 2:<br/>
Input: nums = [4,5,6,7,0,1,2], target = 3<br/>
Output: -1<br/>

Example 3:<br/>
Input: nums = [1], target = 0<br/>
Output: -1<br/>

Answer Approach:<br/>
For solving this question, (Using Binary Search)<br/>
Firstly initializes left and right pointers to the start and end of the array respectively. Then within a while loop, we computes the midpoint mid and checks if nums[mid] matches the target; if so, it returns mid. It then determines which half of the array (left or right of mid) is sorted, using comparisons with nums[left] and nums[mid]. Based on where target lies relative to the sorted half, we adjusts left or right to continue the search until either the target is found or the search space is exhausted, returning -1 if the target isn't in nums. <br/>
