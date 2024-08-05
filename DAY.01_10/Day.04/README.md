# DAY 4
Question:
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Answer:<br/>
For solving this problem, <br/>
Firstly using loops, I merge both input array into a single array (Let us say array-name :"result") (putting first array elements before second array elements in result array). Then using array sorting inbuilt method I sort the result array.<br/>
After that using medians formula for even or odd case (using if-else) , I calculated the median of result array.<br/>
After above operation, I return the value of median.