# Day 56:
Question: Third Maximum Number<br/>
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.


Example 1:<br/>
Input: nums = [3,2,1]<br/>
Output: 1<br/>
Explanation:<br/>
The first distinct maximum is 3.<br/>
The second distinct maximum is 2.<br/>
The third distinct maximum is 1.<br/>

Example 2:<br/>
Input: nums = [1,2]<br/>
Output: 2<br/>
Explanation:<br/>
The first distinct maximum is 2.<br/>
The second distinct maximum is 1.<br/>
The third distinct maximum does not exist, so the maximum (2) is returned instead.<br/>

Example 3:<br/>
Input: nums = [2,2,3,1]<br/>
Output: 1<br/>
Explanation:<br/>
The first distinct maximum is 3.<br/>
The second distinct maximum is 2 (both 2's are counted together since they have the same value).<br/>
The third distinct maximum is 1.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly initialize three variables max1, max2, and max3 to track the three maximum values.
Then iterate through the array according to the below condition.<br/>
For each number:<br/>
 - If it's a duplicate of any of the three maximum values, skip it.<br/>
 - Otherwise, update the maximum values accordingly:<br/>
   - If max1 is null or the number is greater than max1, update max1, shift max2 to max3, and max1 to max2.<br/>
   - If max2 is null or the number is greater than max2, update max2, shift max2 to max3.<br/>
   - If max3 is null or the number is greater than max3, update max3.<br/>
After iterating through the array, return max3 if it's not null, otherwise return max1.<br/>
