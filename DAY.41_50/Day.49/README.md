# Day 49:
Question: Power of Three<br/>
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3^x.<br/>


Example 1:<br/>
Input: n = 27<br/>
Output: true<br/>
Explanation: 27 = 3^3<br/>

Example 2:<br/>
Input: n = 0<br/>
Output: false<br/>
Explanation: There is no x where 3^x = 0.<br/>

Example 3:<br/>
Input: n = -1<br/>
Output: false<br/>
Explanation: There is no x where 3^x = (-1).<br/>


Answer Approach:<br/>
For solving this question,<br/>
Check if the input n is less than or equal to 0. If it is, return false because negative numbers and zero cannot be powers of three.
While n is divisible by 3, repeatedly divide it by 3. This ensures that n is completely divisible by 3, as powers of three should be.<br/>
After the loop, if n becomes 1, then the original n was a power of three. Return true. Otherwise, return false.
It handles the problem by iteratively dividing n by 3 and checking if it eventually becomes 1. If it does, then n is a power of three; otherwise, it isn't.