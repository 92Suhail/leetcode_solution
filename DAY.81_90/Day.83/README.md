# Day 83:
Question: Isomorphic Strings<br/>
Given two strings s and t, determine if they are isomorphic.<br/>

Two strings s and t are isomorphic if the characters in s can be replaced to get t.<br/>

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.<br/>



Example 1:<br/>
Input: s = "egg", t = "add"<br/>
Output: true<br/>

Example 2:<br/>
Input: s = "foo", t = "bar"<br/>
Output: false<br/>

Example 3:<br/>
Input: s = "paper", t = "title"<br/>
Output: true<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly check if their lengths differ; if so, return false. <br/>
Utilize two HashMaps (sToT and tToS) to track character mappings in both directions. Iterate through each character pair (charS, charT) in the strings, verifying and establishing mappings accordingly. If a character in s maps inconsistently to different characters in t, or vice versa, return false. If mappings remain consistent for the entire string, return true. <br/>