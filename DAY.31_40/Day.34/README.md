# Day 34a:
Question: Find the Index of the First Occurrence in a String<br/>
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.<br/>

 
Example 1:<br/>
Input: haystack = "sadbutsad", needle = "sad"<br/>
Output: 0<br/>
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.<br/>

Example 2:<br/>
Input: haystack = "leetcode", needle = "leeto"<br/>
Output: -1<br/>
Explanation: "leeto" did not occur in "leetcode", so we return -1.<br/>


Answer Approach:<br/>
For solving this question,<br/>
If the needle is an empty string, the function returns 0 immediately, beacause an empty string is always present at the beginning of any string.<br/>
The  code iterates through the haystack string using a loop that runs from 0 to `haystack.length() - needle.length()`. This loop ensures that there are enough characters remaining in the haystack to potentially match the needle.<br/>
Within the outer loop, there's an inner loop that compares characters of the haystack with characters of the needle. It iterates through the characters of the needle and checks if the corresponding characters in the haystack match.<br/>
If any character in the needle doesn't match the corresponding character in the haystack, the inner loop breaks. This happens because there's no need to continue checking if the current starting position in the haystack doesn't lead to a match.<br/>
If all characters in the needle match the corresponding characters in the haystack, the inner loop completes without breaking. In this case, the function returns the current index of the haystack, as this index marks the start of the matched substring.<br/>
If the outer loop completes without finding any matches, the function returns -1 to indicate that the needle is not present in the haystack.<br/>