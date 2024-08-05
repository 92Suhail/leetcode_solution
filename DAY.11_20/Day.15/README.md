# Day 15
Question: Multiply Strings.<br/>
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.<br/>
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.<br/>

Example 1:<br/>
Input: num1 = "2", num2 = "3"<br/>
Output: "6"<br/>

Example 2:<br/>
Input: num1 = "123", num2 = "456"<br/>
Output: "56088"<br/>

Answer Approach:<br/>
For solving this question,<br/>
Firstly, check if either num1 or num2 is "0". If so, return "0" because any number multiplied by 0 results in 0.<br/>
Initialize variables m and n to store the lengths of num1 and num2 respectively.<br/>
Create an array arr of size m + n to store the intermediate results of multiplication.<br/>
Iterate through num1 from right to left (starting from the least significant digit) using the index i.<br/>
For each digit in num1, convert it to an integer (a) by subtracting the character '0'.<br/>
Iterate through num2 from right to left (starting from the least significant digit) using the index j.<br/>
For each digit in num2, convert it to an integer (b) by subtracting the character '0'.<br/>
Multiply a and b, then add the result to the corresponding position in arr, considering the proper place value.<br/>
Perform a carry operation on arr to ensure each element is a single digit. Iterate through arr from right to left.<br/>
Add the current element's value divided by 10 to the previous element.<br/>
Update the current element to the remainder of the division by 10.<br/>
Handle leading zeros by finding the index i where the first non-zero digit appears in arr.<br/>
Construct the result string by appending each digit in arr starting from index i.<br/>
Return the result string.<br/>