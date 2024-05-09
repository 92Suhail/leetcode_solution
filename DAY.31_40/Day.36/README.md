# Day 36:
Question: Plus One<br/>
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.<br/>

Increment the large integer by one and return the resulting array of digits.<br/>

 

Example 1:<br/>
Input: digits = [1,2,3]<br/>
Output: [1,2,4]<br/>
Explanation: The array represents the integer 123.<br/>
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].<br/>

Example 2:<br/>
Input: digits = [4,3,2,1]<br/>
Output: [4,3,2,2]<br/>
Explanation: The array represents the integer 4321.<br/>
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].<br/>

Example 3:<br/>
Input: digits = [9]<br/>
Output: [1,0]<br/>
Explanation: The array represents the integer 9.<br/>
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].<br/>

Answer Approach:<br/>
For solving this question,<br/>
we should below steps:<br/>
1. Start from the rightmost digit of the given array.<br/>
2. If the current digit is less than 9, increment it by 1 and return the updated array.<br/>
3. If the current digit is 9, set it to 0 and continue to the next digit.<br/>
4. If all digits are 9, create a new array with length increased by 1 and set the first digit to 1.<br/>