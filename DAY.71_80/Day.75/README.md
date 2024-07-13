# Day 75:
Question: Sort Colors<br/>
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.<br/>

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.<br/>

You must solve this problem without using the library's sort function.<br/>

 

Example 1:<br/>
Input: nums = [2,0,2,1,1,0]<br/>
Output: [0,0,1,1,2,2]<br/>

Example 2:<br/>
Input: nums = [2,0,1]<br/>
Output: [0,1,2]<br/>

Answer Approach:<br/>
For solving this question,<br/>
We use three pointers, first one left for the boundary of 0s (initially at the start), second one right for the boundary of 2s (initially at the end), and last one curr for iterating through the array.<br/>
Then traverse the array with curr from start to end:<br/>
If nums[curr] equals 0, swap it with nums[left], then increment both left and curr. This moves 0s to the beginning. If nums[curr] equals 2, swap it with nums[right], then decrement right. This moves 2s to the end. If nums[curr] equals 1, just move curr forward (curr++).<br/>
Continue until curr exceeds right. At this point, all elements are sorted with 0s on the left, 2s on the right, and 1s in between.
<br/>