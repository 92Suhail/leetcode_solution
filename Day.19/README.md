# Day 19:
Question: Pow(x, n)<br/>
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).<br/>

Example 1:<br/>
Input: x = 2.00000, n = 10<br/>
Output: 1024.00000<br/>

Example 2:<br/>
Input: x = 2.10000, n = 3<br/>
Output: 9.26100<br/>

Example 3:<br/>
Input: x = 2.00000, n = -2<br/>
Output: 0.25000<br/>
Explanation: 2-2 = 1/22 = 1/4 = 0.25<br/>

Answer Approach:<br/>
For handling Negative Exponents,<br/>
If the exponent n is non-negative, the myPow method directly calls the qpow method with x and n.<br/>
If n is negative, it calculates the power as the reciprocal of x raised to the positive value of n. To prevent integer overflow, n is typecasted to long.<br/>

Binary Exponentiation Algorithm (qpow method):<br/>
Initialize a variable ans to 1 to accumulate the result.<br/>
Iterate through the bits of the exponent n from the most significant bit to the least significant bit.<br/>
For each iteration:<br/>
If the current bit of n is 1 (i.e., n & 1 == 1), multiply ans by the current value of the base a.<br/>
Square the base a for the next iteration by setting a = a * a.<br/>
After the loop, return the accumulated result ans.<br/>