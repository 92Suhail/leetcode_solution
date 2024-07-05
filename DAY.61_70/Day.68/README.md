# Day 68:
Question: Regular Expression Matching<br/>
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
<br/>
'.' Matches any single character.​​​​<br/>
'*' Matches zero or more of the preceding element.<br/>
The matching should cover the entire input string (not partial).
<br/>
 

Example 1:<br/>
Input: s = "aa", p = "a"<br/>
Output: false<br/>
Explanation: "a" does not match the entire string "aa".<br/>

Example 2:<br/>
Input: s = "aa", p = "a*"<br/>
Output: true<br/>
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".<br/>

Example 3:<br/>
Input: s = "ab", p = ".*"<br/>
Output: true<br/>
Explanation: ".*" means "zero or more (*) of any character (.)".<br/>



Answer Approach:<br/>
For solving this question,<br/>
Firstly initialize a boolean DP table where dp[i][j] indicates whether the substring of s ending at index i matches the substring of p ending at index j.<br/>
We must care the base cases include dp[0][0] = true for empty strings. <br/>
Then we iterate through each character of s and p, updating the DP table based on whether characters match directly or with the help of '*' (which can match zero or more of the preceding character). <br/>
Finally, dp[s.length()][p.length()] gives us the answer if the entire string s` matches the entire pattern p`. 
<br/>
