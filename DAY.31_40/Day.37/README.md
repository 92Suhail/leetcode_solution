# Day 37:
Question: Add Binary<br/>
Given two binary strings a and b, return their sum as a binary string.<br/>

 
Example 1:<br/>
Input: a = "11", b = "1"<br/>
Output: "100"<br/>

Example 2:<br/>
Input: a = "1010", b = "1011"<br/>
Output: "10101"<br/>

Answer Approach:<br/>
For solving this question,<br/>
Firstly implements the `addBinary` function, which takes two binary strings `a` and `b` and returns their sum as a binary string.<br/>
It initializes a StringBuilder to store the result and variables to track the current index of each input string and the carry. Then, it iterates through the strings from right to left, adding the corresponding digits along with the carry and appending the sum modulo 2 to the result. The carry is updated for the next iteration as the sum divided by 2.<br/>
Finally, if there's any remaining carry after the loop, it's appended to the result. The result string is then reversed and returned.<br/>