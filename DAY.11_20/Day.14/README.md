# Day 14:
Question: Single Number<br/>
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.<br/>

Example 1:<br/>
Input: nums = [2,2,1]<br/>
Output: 1<br/>

Example 2:<br/>
Input: nums = [4,1,2,1,2]<br/>
Output: 4<br/>

Example 3:<br/>
Input: nums = [1]<br/>
Output: 1<br/>

Answer:<br/>
Approach 1 (Using brute force approach):<br/>
Initialize a boolean variable isTwice to keep track of whether the current element has appeared twice.<br/>
Iterate through each element of the array using a nested loop.<br/>
For each element at index i, reset isTwice to false.<br/>
Iterate through the array again to compare the current element nums[i] with every other element nums[j].<br/>
If i != j (meaning we're not comparing the element with itself) and if the current element nums[i] is equal to another element nums[j], set isTwice to true.<br/>
If isTwice remains false after comparing with all other elements, return the current element nums[i] because it only appears once in the array.<br/>
If no such element is found, return the last element of the array (assuming it's the single element, although this assumes the array is non-empty).<br/>

Approach 2 (Using Array Sorting concept):<br/>
Sort the array nums in ascending order using Arrays.sort(nums). <br/>
Initialize a variable result to store the last element of the sorted array nums. (Note: This is initialized to handle cases where the single number is the last element of the array)<br/>
Initialize a variable i to 0 to start iterating through the sorted array.<br/>
While i is less than len - 2 (where len is the length of the array), do the following:<br/>
Check if the current element nums[i] is equal to the next element nums[i+1].<br/>
If they are equal, it means we've found a pair, so increment i by 2 to skip to the next pair of elements.<br/>
If they are not equal, return nums[i] as it must be the single number.<br/>
If the loop completes without finding the single number, return result, which holds the last element of the sorted array.<br/>
