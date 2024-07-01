# Day 65:
Question: Find First and Last Position of Element in Sorted Array<br/>
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.<br/>
If target is not found in the array, return [-1, -1].<br/>
You must write an algorithm with O(log n) runtime complexity.<br/>

 

Example 1:<br/>
Input: nums = [5,7,7,8,8,10], target = 8<br/>
Output: [3,4]<br/>

Example 2:<br/>
Input: nums = [5,7,7,8,8,10], target = 6<br/>
Output: [-1,-1]<br/>

Example 3:<br/>
Input: nums = [], target = 0<br/>
Output: [-1,-1]<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly initializing result to [-1, -1] for storing the indices of the first and last occurrence of the target element.<br/>
Then check if the input array nums is empty or null. If so, return [-1, -1] .<br/>
Implement a binary search (findLeftmostIndex) to find the leftmost index of the target:<br/>
   - Initialize low to 0 and high to nums.length - 1.<br/>
   - While low is less than or equal to high, compute the mid index.<br/>
   - Adjust low and high based on whether nums[mid] is less than, greater than, or equal to target.<br/>
   - Update index when nums[mid] equals target and continue searching on the left (high = mid - 1).<br/>
Implement a similar binary search (findRightmostIndex) to find the rightmost index of the target:<br/>
   - Initialize low to 0 and high to nums.length - 1.<br/>
   - While low is less than or equal to high, compute the mid index.<br/>
   - Adjust low and high based on whether nums[mid] is less than, greater than, or equal to target.<br/>
   - Update index when nums[mid] equals target and continue searching on the right (low = mid + 1).<br/>

After finding both the leftmost and rightmost indices of the target:<br/>
   - If the leftmost index (left) is -1, return [-1, -1] indicating the target is not found.<br/>
   - Otherwise, return [left, right], where left and right are the indices found from findLeftmostIndex and <br/>findRightmostIndex respectively.<br/>
