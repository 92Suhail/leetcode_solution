# Day 58:
Question: First Unique Character in a String<br/>
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.<br/>


Example 1:<br/>
Input: s = "leetcode"<br/>
Output: 0<br/>

Example 2:<br/>
Input: s = "loveleetcode"<br/>
Output: 2<br/>

Example 3:<br/>
Input: s = "aabb"<br/>
Output: -1<br/>



Answer Approach;<br/>
For solving this question,<br/>
Firstly initialize a HashMap to store character frequencies.<br/>
Then iterate through the input string s, and count the frequency of each character using the HashMap.
Iterate through the input string again. For each character, check its frequency in the HashMap. If the frequency is 1, return its index as it's the first non-repeating character.<br/>
If no non-repeating character is found, return -1.

