# DAY 3
Question:
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Answer:<br/>
Approach 1 (Using loops and Hashing):<br/>
For solving this problem,<br/>
Traverse the string using loops and storing their each character into a Hashset. Along with storing characters use another loop to check that storing characters are unique or not (using if-else).if characters are unique then add it to Hashset. After this step in first loop we assume a variable initialising with zero to store the maximum size of set or variable. <br/>
After executing both loops return the assumed variable value.
<br/>
<br/>
Approach 2 (Using loops and Hashing(Optimised)):<br/>
For solving this problem,<br/>
Using while we traverse the string and store it's character into Hashset along with checking their uniqueness. Assume a variable initialised with zero for storing the size of Hashset. if characters are unique then add it Hashset otherwise remove.<br/>
After doing above operations, return the assumed variable value.
