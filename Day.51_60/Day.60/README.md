# Day 60:
Question : Perfect Number<br/>
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.<br/>

 
Example 1:<br/>
Input: num = 28<br/>
Output: true<br/>
Explanation: 28 = 1 + 2 + 4 + 7 + 14<br/>
1, 2, 4, 7, and 14 are all divisors of 28.<br/>

Example 2:<br/>
Input: num = 7<br/>
Output: false<br/>


Answer Approach:<br/>
For solving this question,<br/>
Check if the given number is less than or equal to 1, return false. Then start with sum = 1.<br/>
Iterate from 2 up to the square root of the given number. For each iteration:<br/>
   - If the current number divides the given number evenly:<br/>
     - Add the divisor to the sum.<br/>
     - If the divisor is not the square root of the number, add its complement divisor as well.<br/>
If the sum equals the given number, return true, indicating a perfect number. Otherwise, return false.<br/>
