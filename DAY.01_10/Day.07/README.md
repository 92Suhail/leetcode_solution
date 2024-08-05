# DAY 7

Question:
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.<br/>
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 <br/>

Example 1:<br/>
Input: x = 123<br/>
Output: 321<br/>

Example 2:<br/>
Input: x = -123<br/>
Output: -321<br/>

Example 3:<br/>
Input: x = 120<br/>
Output: 21<br/>

Answer Approach:<br/>
For solving this question, <br/>
First determine the sign input integer, after that do all operations on absolute integer.
For Reverse integer,<br/>
Initialize a variable (Let us say "reversedNum") with starting from "0".

While input integer is not zero,
Find the last digit of input integer(x) using x%10.
then eliminate the last digit by using x/10.
<br/>
Note: In Java, Integer.MAX_VALUE represents the maximum value of a 32-bit signed integer.
So, Check for potential overflow before adding the next digit:
If reversedNum > (Integer.MAX_VALUE - digit) / 10, there will be an overflow. 
Multiply reversedNum by 10 and add the current digit to it: reversedNum = reversedNum * 10 + digit.
<br/>
then at last after loop return the "reversedNum" value with their input sign.