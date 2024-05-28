# Day 54:
Question: Valid Perfect Square<br/>
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.<br/>
You must not use any built-in library function, such as sqrt.<br/>

 

Example 1:<br/>
Input: num = 16<br/>
Output: true<br/>
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.<br/>

Example 2:<br/>
Input: num = 14<br/>
Output: false<br/>
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.<br/>



Answer Approach:<br/>
For solving this question,<br/>
Firstly initialise left boundary to 1 and the right boundary to the given number num. Then we use binary search to iteratively compress the search space. Then next calculate the midpoint between the left and right boundaries.<br/>
After that calculate the square of the midpoint and compare it with num.<br/>
   - If the square equals num, return true as num is a perfect square.<br/>
   - If the square is less than num, adjust the search range by updating the left boundary to mid + 1.<br/>
   - If the square is greater than num, adjust the search range by updating the right boundary to mid - 1.<br/>
Continue the binary search until the left boundary is less than or equal to the right boundary.<br/>
If no perfect square is found within the search range, return false.