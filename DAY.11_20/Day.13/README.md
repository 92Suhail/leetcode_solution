# Day 13
Question: Longest Palindromic Substring<br/>

Given a string s, return the longest palindromic substring in s.<br/>

Example 1:<br/>
Input: s = "babad"<br/>
Output: "bab"<br/>
Explanation: "aba" is also a valid answer.<br/>

Example 2:<br/>
Input: s = "cbbd"<br/>
Output: "bb"<br/>


Answer Approach:<br/>
Dynamic Programming Table dp: We create a 2D boolean array dp of size n x n, where n is the length of the input string s. dp[i][j] will be true if the substring from index i to j is a palindrome.<br/>

Initialization:<br/>
All substrings of length 1 are palindromes, so we initialize dp[i][i] to true for all i.
Check for substrings of length 2 (dp[i][i+1]):<br/>
If s[i] is equal to s[i+1], it means the substring of length 2 is a palindrome.
Update start and maxLen accordingly.
<br/>
Checking Substrings of Length > 2:<br/>
For substrings of length greater than 2, we iterate over all lengths length from 3 to n.<br/>
For each length, iterate over all starting indices i up to n - length + 1.<br/>
Calculate the ending index j for the current substring.<br/>
If the substring from i+1 to j-1 is a palindrome (dp[i+1][j-1]) and s[i] is equal to s[j], then the substring from i to j is also a palindrome.<br/>
Update dp[i][j] accordingly and update start and maxLen if the current length is greater than maxLen.<br/>

Return Result:<br/>
Finally, return the substring of s from index start to start + maxLen as the longest palindromic substring.<br/>