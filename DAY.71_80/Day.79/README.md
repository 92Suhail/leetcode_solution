# Day 79:
Question: Range Sum Query - Immutable<br/>
Given an integer array nums, handle multiple queries of the following type:<br/>

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.<br/>
Implement the NumArray class:<br/>

NumArray(int[] nums) Initializes the object with the integer array nums.<br/>
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).<br/>
 

Example 1:<br/>
Input<br/>
["NumArray", "sumRange", "sumRange", "sumRange"]<br/>
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]<br/>
Output<br/>
[null, 1, -1, -3]<br/>



Answer Approach:<br/>
For solving this question,<br/>
Firstly initialise NumArray class with nums, it computes a prefixSum array where each element at index i stores the sum of nums from the start up to i. For each sumRange(left, right) query, if left is 0, it directly returns prefixSum[right]; otherwise, it computes the range sum as prefixSum[right] - prefixSum[left-1]. <br/>
