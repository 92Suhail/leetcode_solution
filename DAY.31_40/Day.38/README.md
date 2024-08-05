# Day 38:
Question: Sqrt(x)<br/>
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.<br/>

You must not use any built-in exponent function or operator.<br/>

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 <br/>

Example 1:<br/>
Input: x = 4<br/>
Output: 2<br/>
Explanation: The square root of 4 is 2, so we return 2.<br/>

Example 2:<br/>
Input: x = 8<br/>
Output: 2<br/>
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Initialise two variables, start and end, to define the range within which the square root is searched. start is set to 1 and end to x.<br/>
Then iterates through the range [start, end] using a while loop.<br/>
At each iteration, it calculates the midpoint of the current range using (start + end) / 2.<br/>
then after compares the square of the midpoint with x.<br/>
Depending on whether the square of the midpoint is less than or greater than x, it updates the range by adjusting start and end accordingly.<br/>
Once the loop finishes, it returns the value of ans, which holds the integer part of the square root found during the binary search
<br/>
