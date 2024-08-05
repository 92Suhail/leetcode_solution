# Day26:
Question: Divide Two Integers<br/>
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.<br/>

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.<br/>

Return the quotient after dividing dividend by divisor.<br/>

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.<br/>

Example 1:<br/>
Input: dividend = 10, divisor = 3<br/>
Output: 3<br/>
Explanation: 10/3 = 3.33333.. which is truncated to 3.<br/>

Example 2:<br/>
Input: dividend = 7, divisor = -3<br/>
Output: -2<br/>
Explanation: 7/-3 = -2.33333.. which is truncated to -2.<br/>


Answer Approach:<br/>
For solving this question:<br/>
First we have to handle edge cases just like,<br/>
- If the divisor b is 1, the function returns the dividend a as it is.
- If the dividend a is Integer.MIN_VALUE and the divisor b is -1, the function returns Integer.MAX_VALUE (We assume this to avoid the case of overflow).<br/>
then we have to give the sign of result:<br/>
Convert both a and b to negative numbers if their signs are different (This is for handle edge the case Integer.MIN_VALUE).<br/>
then after that we perform division operation by executing following instruction:<br/>
- Initialize the quotient ans to 0.
- Iterate until a becomes greater than b:
-- Initialize x to b and cnt to 1.
-- Double x and cnt in each iteration while x doesn't exceed half of Integer.MIN_VALUE and a is less than or equal to x doubled.
- Update the quotient ans by adding cnt and decrement a by x.
- Repeat this process until a is greater than b.<br/>
then at last, we return the result with proper sign.<br/>

