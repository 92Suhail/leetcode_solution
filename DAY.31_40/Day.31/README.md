# Day 31:
Question :Valid Parentheses<br/>

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.<br/>

An input string is valid if:<br/>

Open brackets must be closed by the same type of brackets.<br/>
Open brackets must be closed in the correct order.<br/>
Every close bracket has a corresponding open bracket of the same type.<br/>
 

Example 1:<br/>
Input: s = "()"<br/>
Output: true<br/>

Example 2:<br/>
Input: s = "()[]{}"<br/>
Output: true<br/>

Example 3:<br/>
Input: s = "(]"<br/>
Output: false<br/>

Answer approach:<br/>
For solving this question,<br/>
Utilize a stack to track opening brackets encountered in the string.<br/>
Loop through each character in the string. Push opening brackets onto the stack.<br/>
When encountering a closing bracket, ensure the stack is not empty. Pop the top bracket and check for a match. If mismatch or empty stack, return false.<br/>
After processing, if the stack is not empty, there are unclosed brackets; return false.<br/>
If the stack is empty, all brackets were correctly matched; return true.<br/>