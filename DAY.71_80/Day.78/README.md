# Day 78:
Question: Pascal's Triangle<br/>
Given an integer numRows, return the first numRows of Pascal's triangle.<br/>
In Pascal's triangle, each number is the sum of the two numbers directly above it.<br/>
 


Example 1:<br/>
Input: numRows = 5<br/>
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]<br/>

Example 2:<br/>
Input: numRows = 1<br/>
Output: [[1]]<br/>



Answer Approach:<br/>
For solving this question,<br/>
Firstly initialise an empty list triangle numRows. If numRows is 0, an empty triangle is returned early. Then the first row (Arrays.asList(1)) is added to triangle.<br/>
After that using a loop from 1 to numRows - 1, each iteration constructs a new row (List<Integer> row). It retrieves the previous row (prevRow) from triangle. The new row starts with 1 (row.add(1)).
Then we calculate Row values:<br/>
For indices from 1 to i - 1 (where i is the current row number), values are computed as the sum of adjacent elements from prevRow and added to row. Finally, each row ends with 1 (row.add(1)). The constructed row is added to triangle.<br/>
After constructing all rows up to numRows, triangle containing Pascal's Triangle is returned.
<br/>