# Day 57:
Question: Add Strings<br/>
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.<br/>


Example 1:<br/>
Input: num1 = "11", num2 = "123"<br/>
Output: "134"<br/>

Example 2:<br/>
Input: num1 = "456", num2 = "77"<br/>
Output: "533"<br/>

Example 3:<br/>
Input: num1 = "0", num2 = "0"<br/>
Output: "0"<br/>


Answer Approach:<br/>
For solving this question,<br/>
Start by initializing a StringBuilder to store the result and a carry variable to track any overflow during addition. Then traverse both input strings from right to left simultaneously. Convert each character to its numeric value and add the digits along with the carry. If the sum exceeds 9, update the carry and append only the unit digit to the result.<br/>
After the loop, if there's still a carry, append it to the result. Then, reverse the result string and return it.
