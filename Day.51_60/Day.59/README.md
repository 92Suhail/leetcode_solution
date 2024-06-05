# Day 59:
Question: Fibonacci Number<br/>
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,<br/>
F(0) = 0, F(1) = 1<br/>
F(n) = F(n - 1) + F(n - 2), for n > 1.<br/>
Given n, calculate F(n).<br/>

 

Example 1:<br/>
Input: n = 2<br/>
Output: 1<br/>
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.<br/>

Example 2:<br/>
Input: n = 3<br/>
Output: 2<br/>
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.<br/>

Example 3:<br/>
Input: n = 4<br/>
Output: 3<br/>
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.<br/>


Answer Approach:<br/>
For solving this question,<br/>
If n is 0 or 1, return 0 or 1 respectively (Base cases for the Fibonacci sequence). Then initialize an array fibArray of size n + 1 to store Fibonacci numbers.<br/>
Use a loop to iterate from 2 to n. For each index i, calculate the Fibonacci number by adding the previous two Fibonacci numbers (fibArray[i-1] and fibArray[i-2]).<br/>
After the loop, return fibArray[n], which contains the Fibonacci number for the input n.