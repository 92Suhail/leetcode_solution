# Day 27:
Question: Length of Last Word<br/>
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.<br/>

Example 1:<br/>
Input: s = "Hello World"<br/>
Output: 5<br/>
Explanation: The last word is "World" with length 5.<br/>

Example 2:<br/>
Input: s = "   fly me   to   the moon  "<br/>
Output: 4<br/>
Explanation: The last word is "moon" with length 4.<br/>

Example 3:<br/>
Input: s = "luffy is still joyboy"<br/>
Output: 6<br/>
Explanation: The last word is "joyboy" with length 6.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly creating a variable named "length" initialised with zero to store the length of last word and creating variable "i" for iterating string from last so initialised i= StringLength -1.<br/>

Then skip trailing spaces using while loop by moving the pointer "i" backwards until finding non-space character or reach the beginning of the string.<br/>
When reached the last non-space character or the beginning of the string, start counting the length of the last word by moving the pointer "i" backwards until we encounter a space or reach the beginning of the string.<br/>

For each non-space character encountered in above step, we increment the "length".<br/>
Then at last, return the value of length. <br/>

