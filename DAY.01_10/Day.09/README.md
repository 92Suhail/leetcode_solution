# DAY 9:
Question:<br/>
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.<br/>

Example 1:<br/>
Input: nums = [1,2,3,4,5,6,7], k = 3<br/>
Output: [5,6,7,1,2,3,4]<br/>
Explanation:<br/>
rotate 1 steps to the right: [7,1,2,3,4,5,6]<br/>
rotate 2 steps to the right: [6,7,1,2,3,4,5]<br/>
rotate 3 steps to the right: [5,6,7,1,2,3,4]<br/>

Example 2:<br/>
Input: nums = [-1,-100,3,99], k = 2<br/>
Output: [3,99,-1,-100]<br/>
Explanation: <br/>
rotate 1 steps to the right: [99,-1,-100,3]<br/>
rotate 2 steps to the right: [3,99,-1,-100]<br/>


Answer Approach:<br/>
For solving this question,<br/>
First create a rotate function,<br/>
First, it ensures that k is within the bounds of the array length by calculating k = k % nums.length. This is to handle cases where k is larger than the length of the array.<br/>
Next, calls the reverse method three times to achieve the rotation:<br/>
reverse(nums, 0, nums.length-1) - This reverses the entire array, effectively bringing the elements that need to be rotated to the end.<br/>
reverse(nums, 0, k-1) - This reverses the first k elements of the array. After the previous step, these were the last k elements of the original array. Reversing them places them back at the start.<br/>
reverse(nums, k, nums.length-1) - This reverses the remaining elements from index k to the end of the array. These elements were originally at the beginning of the array but were moved to the end in the first step.
<br/>
reverse method:<br/>
Inside this function we reverse the array using two pointers start and end.
swap start and end index element using temp variable method.
then, increase the start pointer by 1 and decrease the end pointer by 1.