# Day 85:
Question: Two Sum || - Input Array is Sorted<br/>
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.<br/>

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
<br/>
The tests are generated such that there is exactly one solution. You may not use the same element twice.
<br/>
Your solution must use only constant extra space.<br/>

Example 1:<br/>
Input: numbers = [2,7,11,15], target = 9<br/>
Output: [1,2]<br/>
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].<br/>
<br/>
Example 2:<br/>
Input: numbers = [2,3,4], target = 6<br/>
Output: [1,3]<br/>
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].<br/>

Example 3:<br/>
Input: numbers = [-1,0], target = -1<br/>
Output: [1,2]<br/>
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].<br/>



Answer Approach:<br/>
For solving this question, (Using two pointer technique)<br/>
Firstly we initialize two pointers, left at the start (index 0) and right at the end (index numbers.length - 1) of the sorted array. <br/>
Then iterate while left is less than right, calculating the sum of numbers[left] and numbers[right]. If the sum equals the target, return the 1-indexed positions [left + 1, right + 1]. If the sum is less than the target, increment the left pointer to increase the sum; if greater, decrement the right pointer to decrease the sum.<br/>