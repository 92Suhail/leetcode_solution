# Day 80:
Question: Pascal's Triangle ||<br/>
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.<br/>

In Pascal's triangle, each number is the sum of the two numbers directly above it.<br/>
 

Example 1:<br/>
Input: rowIndex = 3<br/>
Output: [1,3,3,1]<br/>

Example 2:<br/>
Input: rowIndex = 0<br/>
Output: [1]<br/>

Example 3:<br/>
Input: rowIndex = 1<br/>
Output: [1,1]<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly initialize the row and start with the first element which is always 1.<br/>
Then iterate through each row up to rowIndex:<br/>
Add a 0 at the end of the list to make space for the new element.<br/>
Update each element from the end to the beginning using the sum of the current element and the previous element.<br/><br/>
After the loop, the list row contains the elements of the rowIndexth row of Pascal's Triangle.<br/>