# DAY 5
Question:
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
<br/>

Example 1:<br/>
Input: nums = [1,2,3,1]<br/>
Output: true<br/>

Example 2:<br/>
Input: nums = [1,2,3,4]<br/>
Output: false<br/>

Example 3:<br/>
Input: nums = [1,1,1,3,3,4,3,2,4,2]<br/>
Output: true<br/>

Answer:<br/>
Approach 1 (Using Brute Force approach):<br/>
For solving this problem, <br/>
Traversing array using loop along with again traversing array using loops to check their element are equal or not, if it's equal then return true.<br/>
After completing the loops, if no element are equal found, then return false.
<br/>

Approach 2 (Using Hashing in Java):<br/>
For solving this problem, <br/>
To avoid Two loops, Use a single loop for traversing array. Along with traversing array add their element into Hashmap(HashSet) and check if next elment coming in HashSet is already present in HashSet or not. If new element coming in HashSet is already present inside HashSet then return true.<br/>
After traversing array if no duplicate elements are found in HashSet then return false.<br/>
<br/>