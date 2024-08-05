# Day 23:
Question : Longest Common Prefix<br/>
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".<br/>

Example 1:<br/>
Input: strs = ["flower","flow","flight"]<br/>
Output: "fl"<br/>

Example 2:<br/>
Input: strs = ["dog","racecar","car"]<br/>
Output: ""<br/>
Explanation: There is no common prefix among the input strings.<br/>


Answer Approach:<br/>
For solving this question,<br/>
We follow below given steps:<br/>
Initialization:<br/>
Initialize n to store the length of the input string array strs.<br/>

Main Loop:<br/>
Iterate through characters of the first string strs[0].<br/>

Comparison Loop:<br/>
Within the main loop, iterate through the array of strings starting from the second string (strs[1]).<br/>
Check if the current index i exceeds the length of any string or if the character at index i of the current string differs from the character at the same index in strs[0].<br/>
Return the substring of strs[0] from index 0 to i (exclusive) if either condition is met.
<br/>
Return Result:<br/>
If the main loop completes without returning, return the entire strs[0] string as the longest common prefix.<br/>