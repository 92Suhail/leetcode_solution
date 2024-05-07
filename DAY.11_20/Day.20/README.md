# Day 20:
Question: Power of Two<br/>
Given an integer n, return true if it is a power of two. Otherwise, return false.<br/>
An integer n is a power of two, if there exists an integer x such that n == 2x.<br/>

Example 1:<br/>
Input: n = 1<br/>
Output: true<br/>
Explanation: 20 = 1<br/>

Example 2:<br/>
Input: n = 16<br/>
Output: true<br/>
Explanation: 24 = 16<br/>

Example 3:<br/>
Input: n = 3<br/>
Output: false<br/>

Answer Approach:<br/>
Firstly check input number is positive or not. Because negative numbers and zero cannot be powers of two.<br/>
Using Bitwise "AND Operation" expression (n & (n - 1)) clears the least significant set bit of n.<br/>
The result of the bitwise AND operation is compared with 0 using the == operator. If the result is 0, it means that n has only one bit set, which implies that n is a power of two.<br/>
The method returns true if both conditions (n > 0 and (n & (n - 1)) == 0) are true, indicating that n is a power of two. Otherwise, it returns false.<br/>