# Day 21:
Question: Integer to Roman<br/>
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.<br/>
Symbol       Value<br/>
I             1<br/>
V             5<br/>
X             10<br/>
L             50<br/>
C             100<br/>
D             500<br/>
M             1000<br/>
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.<br/>

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:<br/>

I can be placed before V (5) and X (10) to make 4 and 9. <br/>
X can be placed before L (50) and C (100) to make 40 and 90. <br/>
C can be placed before D (500) and M (1000) to make 400 and 900.<br/>
Given an integer, convert it to a roman numeral.<br/>

 
Example 1:<br/>
Input: num = 3<br/>
Output: "III"<br/>
Explanation: 3 is represented as 3 ones.<br/>

Example 2:<br/>
Input: num = 58<br/>
Output: "LVIII"<br/>
Explanation: L = 50, V = 5, III = 3.<br/>

Example 3:<br/>
Input: num = 1994<br/>
Output: "MCMXCIV"<br/>
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.<br/>


Answer Approach:<br/>
For solving this question,<br/>
Firstly we define two lists,<br/>
First one -> cs contains Roman numeral characters in descending order along with their special combinations.<br/>
Second one -> vs contains the corresponding integer values for each Roman numeral character or combination.<br/>
A StringBuilder named ans is initialized to store the resulting Roman numeral string.
The code iterates through the lists simultaneously using a for loop, with index i ranging from 0 to the size of the cs list.<br/>
Inside the loop, it repeatedly checks if num is greater than or equal to the current integer value vs.get(i).<br/>
If num is greater than or equal to vs.get(i), it subtracts vs.get(i) from num and appends the corresponding Roman numeral character cs.get(i) to the ans StringBuilder.
This process continues until num becomes less than the current integer value.<br/>
Finally, the method returns the resulting Roman numeral string obtained from the StringBuilder ans.<br/>