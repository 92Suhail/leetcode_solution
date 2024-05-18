# Day 43:
Question: Minimal Path Sum<br/>
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.<br/>
Note: You can only move either down or right at any point in time.

Example 1:<br/>
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]<br/>
Output: 7<br/>
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.<br/>

Example 2:<br/>
Input: grid = [[1,2,3],[4,5,6]]<br/>
Output: 12<br/>

Answer Approach:<br/>
For solving this question,<br/>
Firstly initialize variables m and n to store the number of rows and columns in the grid, respectively. Create a 2D array dp of size m x n to store the minimum path sum for each cell.<br/>
After that set dp[0][0] (top-left cell) to the value of the corresponding cell in the grid.
Then iterate through the first row and column of the dp array. For each cell (0, i) and (j, 0), set its value to the sum of the previous cell's value in the same row/column and the corresponding cell's value in the grid.<br/>

Iterate through the remaining cells of the dp array (starting from (1, 1)). For each cell (i, j), calculate the minimum path sum to reach it by choosing the minimum sum from either the cell above (i-1, j) or the cell to the left (i, j-1) and add the value of the current cell in the grid.<br/>

Then at last return the value of dp[m-1][n-1], which represents the minimum path sum from the top-left cell to the bottom-right cell.

