# Day 51:
Question: Reverse String<br/>
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.


Example 1:<br/>
Input: s = ["h","e","l","l","o"]<br/>
Output: ["o","l","l","e","h"]<br/>

Example 2:<br/>
Input: s = ["H","a","n","n","a","h"]<br/>
Output: ["h","a","n","n","a","H"]<br/>

Answer Approach:<br/>
For solving this question,<br/>
We should go through below steps:<br/>
1. Initialize two pointers, `left` and `right`, pointing to the start and end of the array respectively.<br/>
2. Iterate over the array while `left` is less than `right`.<br/>
3. Inside the loop, swap the characters at `left` and `right` indices.<br/>
4. Move `left` pointer one step forward and `right` pointer one step backward.<br/>
5. Repeat steps 2-4 until `left` becomes greater than or equal to `right`.<br/>
6. The input array `s` is reversed in-place.<br/>

