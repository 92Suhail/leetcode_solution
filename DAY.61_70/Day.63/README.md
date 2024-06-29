# Day 63:
Question: Single Number ||<br/>
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.<br/>

You must implement a solution with a linear runtime complexity and use only constant extra space.<br/>


Example 1:<br/>
Input: nums = [2,2,3,2]<br/>
Output: 3<br/>

Example 2:<br/>
Input: nums = [0,1,0,1,0,1,99]<br/>
Output: 99<br/>

Answer Approach:<br/>
For solving this question, I use HashMap Counting Approach.<br/>
Use a HashMap to count occurrences of each number in the array.<br/>
Iterate through the array and populate the HashMap with number counts.<br/>
Iterate through the array again to find the number that appears exactly once (count of 1 in the HashMap).<br/>
Then after that next step,<br/>
Initialize a HashMap countMap to store number counts.<br/>
Iterate through nums, updating countMap with each number's count.<br/>
Iterate through nums again to check which number has a count of 1 in countMap.<br/>
Return the number found with a count of 1, which is the single number.
<br/>
