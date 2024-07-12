# Day 74:
Question: Word Break<br/>
Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.<br/>

Note that the same word in the dictionary may be reused multiple times in the segmentation.<br/>

 

Example 1:<br/>
Input: s = "leetcode", wordDict = ["leet","code"]<br/>
Output: true<br/>
Explanation: Return true because "leetcode" can be segmented as "leet code".<br/>

Example 2:<br/>
Input: s = "applepenapple", wordDict = ["apple","pen"]<br/>
Output: true<br/>
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.<br/>

Example 3:<br/>
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]<br/>
Output: false<br/>
 

Answer Approach:<br/>
For solving this question,<br/>
Firstly initializes a boolean array dp where dp[i] indicates whether the substring s.substring(0, i) can be segmented. By iterating through each possible end position end in s and checking all preceding substrings start, it checks if dp[start] is true (indicating s.substring(start, end) can be segmented) and if this substring exists in wordDict. If both conditions are met, it sets dp[end] to true. Finally, it returns dp[s.length()] which determines if the entire string s can be segmented into words from wordDict.<br/>
