# Day 73:
Question: Is Subsequence<br/>
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.<br/>

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
<br/>
 

Example 1:<br/>
Input: s = "abc", t = "ahbgdc"<br/>
Output: true<br/>

Example 2:<br/>
Input: s = "axc", t = "ahbgdc"<br/>
Output: false<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly initialise two pointers (sIndex and tIndex) starting at 0. Traverse through t with tIndex, and whenever characters at s[sIndex] and t[tIndex] match, increment sIndex. Always increment tIndex to continue the traversal. If sIndex reaches the length of s by the end of the loop, it means all characters of s were found in t in the correct order, so return true; otherwise, return false.<br/>