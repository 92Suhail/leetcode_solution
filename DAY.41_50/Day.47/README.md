# Day 47:
Question: Add Digits<br/>
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
<br/>
 
Example 1:<br/>
Input: num = 38<br/>
Output: 2<br/>
Explanation: The process is<br/>
38 --> 3 + 8 --> 11<br/>
11 --> 1 + 1 --> 2 <br/>
Since 2 has only one digit, return it.<br/>

Example 2:<br/>
Input: num = 0<br/>
Output: 0<br/>


Answer Approach:<br/>
For solving this question,<br/>
Using a while loop that continues until the number `num` is greater than or equal to 10.<br/>
Within the loop, initialize a variable `sum` to store the sum of digits. Use another nested while loop to iterate through each digit of `num` and add them to `sum`. Update `num` by removing the last digit in each iteration.<br/>
After completing the inner while loop, assign the value of `sum` back to `num`.<br/>
Once `num` becomes a single digit (less than 10), return it as the result.
