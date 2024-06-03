Day 60:
Question : Perfect Number
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.

 
Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.

Example 2:
Input: num = 7
Output: false


Answer Approach:
For solving this question,
Check if the given number is less than or equal to 1, return false. Then start with sum = 1.
Iterate from 2 up to the square root of the given number. For each iteration:
   - If the current number divides the given number evenly:
     - Add the divisor to the sum.
     - If the divisor is not the square root of the number, add its complement divisor as well.
If the sum equals the given number, return true, indicating a perfect number. Otherwise, return false.



For codes and complete questions, click on the given link:
https://lnkd.in/g4PAUiTR





#Leetcode #problemsolving #100days100problem #Hiring #hiring #google #facebook #Amazon #Coding #microsoft