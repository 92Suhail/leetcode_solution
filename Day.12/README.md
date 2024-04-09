# Day 12
Question: Zigzag Conversion<br/>
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
<br/>
P   A   H   N<br/>
A P L S I I G<br/>
Y   I   R<br/>
And then read line by line: "PAHNAPLSIIGYIR"<br/>
<br/>
Write the code that will take a string and make this conversion given a number of rows:<br/>
string convert(string s, int numRows);<br/>
Example 1:<br/>
Input: s = "PAYPALISHIRING", numRows = 3<br/>
Output: "PAHNAPLSIIGYIR"<br/>

Example 2:<br/>
Input: s = "PAYPALISHIRING", numRows = 4<br/>
Output: "PINALSIGYAHRPI"<br/>
Explanation:<br/>
P     I    N<br/>
A   L S  I G<br/>
Y A   H R<br/>
P     I<br/>

Example 3:<br/>
Input: s = "A", numRows = 1<br/>
Output: "A"<br/>

Answer Approach:<br/>
For Solving this question,<br/>
1. Edge Case Handling<br/>
The code starts by handling edge cases:<br/>
If numRows is 1, then the output will be the same as the input because there's no zigzag pattern with one row.<br/>
If numRows is greater than or equal to the length of the string s, then we also return the original string because in this case, the zigzag pattern will be the same as the input string itself.
<br/>
2. Create an Array of StringBuilders<br/>
Next, the code creates an array of StringBuilder objects called rows, with the length equal to numRows. Each StringBuilder in this array will represent a row in the zigzag pattern.
<br/>
3. Iterate Through Characters<br/>
The code then initializes currentRow to 0 and goingDown to false. These variables are used to keep track of the current row and the direction in which we are moving (either down or up).<br/>
It then iterates through each character in the input string s. For each character c:<br/>
It appends the character to the StringBuilder of the current row (rows[currentRow]).<br/>
If we're at the first or last row (currentRow == 0 or currentRow == numRows - 1), it changes the direction by toggling goingDown.<br/>
It then adjusts the currentRow based on the direction (goingDown). If goingDown is true, currentRow is incremented by 1; otherwise, it is decremented by 1.
<br/>
4. Concatenate Rows<br/>
After processing all characters, the code creates a new StringBuilder called result.
It then iterates through each StringBuilder in the rows array and appends its contents to the result StringBuilder.<br/>

5. Return the Result<br/>
Finally, it returns the string representation of the result StringBuilder.<br/>