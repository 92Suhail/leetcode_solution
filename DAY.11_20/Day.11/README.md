# Day 11:
Question : Given an integer x, return true if x is a palindrome, and false otherwise..
<br/>
Example 1:<br/>
Input: x = 121<br/>
Output: true<br/>
Explanation: 121 reads as 121 from left to right and from right to left.<br/>

Example 2:<br/>
Input: x = -121<br/>
Output: false<br/>
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.<br/>

Example 3:<br/>
Input: x = 10<br/>
Output: false<br/>
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly, Convert Integer to String:<br/>
Convert the input integer x to a string xStr. This is done using Integer.toString(x), which converts the integer to its string representation.<br/>
Two Pointer Technique:<br/>
Initialize two pointers left and right.<br/>
left starts from the beginning of the string (0), and right starts from the end of the string (xStr.length() - 1).<br/>
Comparing Characters:<br/>
Inside the while loop, compare the characters at indices left and right in xStr.<br/>
If these characters are not equal, it means x cannot be a palindrome, so we return false.<br/>
Move Pointers:<br/>
If the characters are equal, increment left and decrement right.
This moves the pointers towards the center of the string.
<br/>
Palindrome Check:<br/>
Repeat this process until left becomes greater than or equal to right. This means we've checked all necessary characters.<br/>
If the loop completes without finding unequal characters, return true. This indicates that x is a palindrome.<br/>
