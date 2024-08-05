# Day 50:
Question: Power of Four<br/>
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4^x.
<br/>

Example 1:<br/>
Input: n = 16<br/>
Output: true<br/>

Example 2:<br/>
Input: n = 5<br/>
Output: false<br/>

Example 3:<br/>
Input: n = 1<br/>
Output: true<br/>


Answer Approach:<br/>
For solving this question,<br/>
Check if the input n is less than or equal to 0. If it is, return false because negative numbers and zero cannot be powers of four.
While n is divisible by 4, repeatedly divide it by 4. This ensures that n is completely divisible by 4, as powers of four should be.<br/>
After the loop, if n becomes 1, then the original n was a power of four. Return true. Otherwise, return false.
It handles the problem by iteratively dividing n by 4 and checking if it eventually becomes 1. If it does, then n is a power of four; otherwise, it isn't.<br/>
