# Day 72:
Question: Valid Palindrome<br/>
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.<br/>

Given a string s, return true if it is a palindrome, or false otherwise.
<br/>
 

Example 1:<br/>
Input: s = "A man, a plan, a canal: Panama"<br/>
Output: true<br/>
Explanation: "amanaplanacanalpanama" is a palindrome.<br/>

Example 2:<br/>
Input: s = "race a car"<br/>
Output: false<br/>
Explanation: "raceacar" is not a palindrome.<br/>

Example 3:<br/>
Input: s = " "<br/>
Output: true<br/>
Explanation: s is an empty string "" after removing non-alphanumeric characters.<br/>
Since an empty string reads the same forward and backward, it is a palindrome.<br/>



Answer Approach:<br/>
For solving this question,<br/>
Firstly we convert the string to lowercase. Then remove all non-alphanumeric characters using a regular expression. We use two pointer technique for further solving, Initialsing one pointer starting from the beginning and one from the end of the string. Then compare characters at these pointers. If they don't match, return false. Move the pointers towards the center and continue the comparison.<br/>
Finally we check, if all characters match during the comparison, return true, indicating the string is a palindrome.
