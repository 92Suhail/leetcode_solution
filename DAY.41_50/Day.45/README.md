# Day 45:
Question: Contains Duplicate ||<br/>
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.<br/>

 
Example 1:<br/>
Input: nums = [1,2,3,1], k = 3<br/>
Output: true<br/>

Example 2:<br/>
Input: nums = [1,0,1,1], k = 1<br/>
Output: true<br/>

Example 3:<br/>
Input: nums = [1,2,3,1,2,3], k = 2<br/>
Output: false<br/>


Answer Approach:<br/>
For solving this question,<br/>
Create a HashMap to store elements from the array as keys and their corresponding indices as values. Then iterate through the array, accessing each element and its index.<br/>
For each element, check if it already exists in the HashMap. If it does, compare the absolute difference between the current index and the index stored in the HashMap for that element.<br/>
If the absolute difference is less than or equal to k, return true, indicating that there are two distinct indices with the same value within the specified distance. If no such pair is found, continue iterating. If the loop completes without finding a pair, we return false.<br/>
Along with iterate through the array, update the HashMap with the current element and its index.<br/>

