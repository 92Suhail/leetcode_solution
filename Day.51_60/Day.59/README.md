Day 59:
Question: Fibonacci Number
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.


Answer Approach:
For solving this question,
If n is 0 or 1, return 0 or 1 respectively (Base cases for the Fibonacci sequence). Then initialize an array fibArray of size n + 1 to store Fibonacci numbers.
Use a loop to iterate from 2 to n. For each index i, calculate the Fibonacci number by adding the previous two Fibonacci numbers (fibArray[i-1] and fibArray[i-2]).
After the loop, return fibArray[n], which contains the Fibonacci number for the input n.



For codes and complete questions, click on the given link:
https://lnkd.in/g4PAUiTR





#Leetcode #problemsolving #100days100problem #Hiring #hiring #google #facebook #Amazon #Coding #microsoft