# Day: 92
Question: Word Search<br/>
Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.<br/>

 

Example 1:<br/>
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"<br/>
Output: true<br/>

Example 2:<br/>
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"<br/>
Output: true<br/>

Example 3:<br/>
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"<br/>
Output: false<br/>


Answer Approach:<br/>
For solving this question, (Using DFS)<br/>
Firstly iterates through each cell in the board, initiating a DFS whenever the cell matches the first character of the word. The DFS explores all four directions (right, left, down, up) from the current cell, marking cells as visited to avoid reuse and backtracking if necessary. If the entire word is found, it returns true; otherwise, it returns false.<br/>