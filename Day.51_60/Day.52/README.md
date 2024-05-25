# Day 52:
Question: Intersection of Two Arrays<br/>
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.


Example 1:<br/>
Input: nums1 = [1,2,2,1], nums2 = [2,2]<br/>
Output: [2]<br/>

Example 2:<br/>
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]<br/>
Output: [9,4]<br/>
Explanation: [4,9] is also accepted.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Utilize a HashSet to store unique elements from one of the input arrays (nums1).
Then iterate through the second array (nums2) and check if each element exists in the HashSet. If yes, add it to another HashSet (intersection) to store the intersection.<br/>
Convert the HashSet containing the intersection elements to an array, as the return type demands an array.<br/>
Return the resulting array containing unique intersection elements.
