# Day: 97
Question: Next Permutation<br/>
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.<br/>

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].<br/>
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).<br/>

For example, the next permutation of arr = [1,2,3] is [1,3,2].<br/>
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].<br/>
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.<br/>
Given an array of integers nums, find the next permutation of nums.<br/>

The replacement must be in place and use only constant extra memory.<br/>

 

Example 1:<br/>
Input: nums = [1,2,3]<br/>
Output: [1,3,2]<br/>

Example 2:<br/>
Input: nums = [3,2,1]<br/>
Output: [1,2,3]<br/>

Example 3:<br/>
Input: nums = [1,1,5]<br/>
Output: [1,5,1]<br/>
 
 
Answer Approach:<br/>
For solving this question,<br/>
Firstly we start from the end of the array and look for the first number that is smaller than the number right after it. This is where the order stops increasing as you move backward.<br/>
Once you find that number, look again from the end of the array to find the smallest number that is bigger than it. Swap these two numbers. After swapping, the part of the array after the "turning point" might still be in descending order. Simply reverse it to get the next smallest order.<br/>
