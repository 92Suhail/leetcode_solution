# Day 61:
Question: Missing Number<br/>
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.<br/>



Example 1:<br/>
Input: nums = [3,0,1]<br/>
Output: 2<br/>
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
<br/>
Example 2:<br/>
Input: nums = [0,1]<br/>
Output: 2<br/>
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.<br/>

Example 3:<br/>
Input: nums = [9,6,4,2,3,5,7,0,1]<br/>
Output: 8<br/>
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly determine the expected sum of the first n natural numbers using the formula: totalSum = n * (n + 1) / 2. Then calculate the sum of the numbers in the given array.<br/>
The missing number is the difference between the expected sum and the actual sum of the array elements.<br/>
Return the missing number.
