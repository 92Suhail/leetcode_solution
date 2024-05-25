# Day 53:
Question: Intersection of Two Arrays ||<br/>
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 
Example 1:<br/>
Input: nums1 = [1,2,2,1], nums2 = [2,2]<br/>
Output: [2,2]<br/>

Example 2:<br/>
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]<br/>
Output: [4,9]<br/>
Explanation: [9,4] is also accepted.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Use a HashMap to store the frequency of elements in nums1, where the keys are the elements and the values are their frequencies.<br/>
Iterate through nums2 and check if the element exists in the HashMap and its frequency is greater than 0. If so, add the element to the result and decrement its frequency in the HashMap.<br/>
Convert the resulting List of intersecting elements to an array and return it.<br/>
This approach ensures that the resulting array contains elements that appear in both nums1 and nums2 as many times as they appear in both arrays.
