# DAY 10
Question:<br/>
You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:
<br/>
nums1.length == nums2.length == nums.length / 2.<br/>
nums1 should contain distinct elements.<br/>
nums2 should also contain distinct elements.<br/>
Return true if it is possible to split the array, and false otherwise.
<br/>
Example 1:<br/>
Input: nums = [1,1,2,2,3,4]<br/>
Output: true<br/>
Explanation: One of the possible ways to split nums is nums1 = [1,2,3] and nums2 = [1,2,4].
<br/>
Example 2:<br/>
Input: nums = [1,1,1,1]<br/>
Output: false<br/>
Explanation: The only possible way to split nums is nums1 = [1,1] and nums2 = [1,1]. Both nums1 and nums2 do not contain distinct elements. Therefore, we return false.
<br/>
Answer Approach:<br/>
For solving this question,<br/>
Check if the length of the nums array is odd. If it is, then it's not possible to split into pairs, so return false.<br/>
Create a HashMap called map to store elements from the nums array as keys and their frequencies as values.<br/>
Iterate through each element in the nums array:<br/>
For each element, check if it's already in the map. If it is, get its current frequency from the map, increment it by 1, and store it back in the map.<br/>
If the element is not in the map, its frequency is 1.<br/>
While doing this, check if the frequency of any element exceeds 2. If it does, return false immediately since it's not possible to split into pairs with more than two occurrences of an element.<br/>
If the loop completes without returning false, it means the array can be split into pairs of equal elements, so return true.<br/>