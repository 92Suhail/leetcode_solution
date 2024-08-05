# Day 48:
Question: Moves Zeroes<br/>
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.<br/>
Note that you must do this in-place without making a copy of the array.


Example 1:<br/>
Input: nums = [0,1,0,3,12]<br/>
Output: [1,3,12,0,0]<br/>

Example 2:<br/>
Input: nums = [0]<br/>
Output: [0]<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly initialize an index variable to track non-zero elements.
Then iterate through the array, if the current element is non-zero, move it to the position indicated by the index and increment the index.<br/>
After the loop, fill the remaining positions with zeroes.
The array is modified in-place, without creating a copy.
